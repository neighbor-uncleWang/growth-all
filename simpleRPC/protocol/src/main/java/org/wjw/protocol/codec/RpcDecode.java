package org.wjw.protocol.codec;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import lombok.extern.slf4j.Slf4j;
import org.wjw.protocol.constants.ReqType;
import org.wjw.protocol.constants.RpcConstants;
import org.wjw.protocol.core.Header;
import org.wjw.protocol.core.RpcProtocol;
import org.wjw.protocol.core.RpcRequest;
import org.wjw.protocol.core.RpcResponse;
import org.wjw.protocol.serial.ISerializer;
import org.wjw.protocol.serial.SerializerManager;

import java.util.List;

/**
 * 解码器
 *
 * @author wjw
 * @ClassName MessageRecordDecode.java
 * @createTime 2022-04-30 09:56
 */
@Slf4j
public class RpcDecode extends ByteToMessageDecoder {


    /**
     * 消息协议格式：sessionId | reqType | Content-length | Content
     *
     * @param ctx
     * @param in
     * @param out
     * @throws Exception
     */
    @Override
    protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) throws Exception {
        log.info("==========begin RpcDecode==========");
        if (in.readableBytes() < RpcConstants.HEAD_TOTOAL_LEN) {
            return;
        }
        //标记读取开始索引
        in.markReaderIndex();

        short maci = in.readShort();
        if (maci != RpcConstants.MAGIC) {
            throw new IllegalAccessException();
        }
        byte serialType = in.readByte();
        byte reqType = in.readByte();
        long requestId = in.readLong();
        int dataLen = in.readInt();

        if (in.readableBytes() < dataLen) {
            in.resetReaderIndex();
            return;
        }
        //读取消息体的内容
        byte[] content=new byte[dataLen];
        in.readBytes(content);

        Header header = new Header();
        header.setMagic(maci);
        header.setSerialType(serialType);
        header.setReqType(reqType);
        header.setRequestId(requestId);
        header.setLength(dataLen);
        ISerializer serializer = SerializerManager.getSerializer(serialType);

        ReqType rt = ReqType.findByCode(reqType);
        switch (rt) {
            case REQ:
                RpcRequest request = serializer.deserialize(content, RpcRequest.class);
                RpcProtocol<RpcRequest> reqProtocol = new RpcProtocol<RpcRequest>();
                reqProtocol.setHeader(header);
                reqProtocol.setContent(request);
                out.add(reqProtocol);
                break;
            case RES:
                RpcResponse response = serializer.deserialize(content, RpcResponse.class);
                RpcProtocol<RpcResponse> resProtocol = new RpcProtocol<RpcResponse>();
                resProtocol.setHeader(header);
                resProtocol.setContent(response);
                out.add(resProtocol);
                break;
            case PING:
                //TODO
                break;
            default:
                break;
        }

    }
}
