package com.wjw.message.codec;

import com.wjw.message.protocol.Header;
import com.wjw.message.protocol.MessageRecord;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;

import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.util.List;

/**
 * 解码器
 *
 * @author wjw
 * @ClassName MessageRecordDecode.java
 * @createTime 2022-04-30 09:56
 */
@Slf4j
public class MessageRecordDecode extends ByteToMessageDecoder {


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
        MessageRecord record = new MessageRecord();
        //ByteBuf 接收到的消息报文
        Header header = new Header();

        header.setSessionId(in.readLong());
        header.setErqType(in.readByte());
        header.setLength(in.readInt());

        record.setHeader(header);
        if (header.getLength() > 0) {
            byte[] contents = new byte[header.getLength()];
            in.readBytes(contents);
            ObjectInputStream ios = new ObjectInputStream(new ByteArrayInputStream(contents));
            //得到一个反序列化的数据
            record.setBody(ios.readObject());
            log.info("反序列化的结果：" + record);
        } else {
            log.info("消息内容为空");
        }
    }
}
