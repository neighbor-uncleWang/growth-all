package com.wjw.message.codec;

import com.wjw.message.protocol.Header;
import com.wjw.message.protocol.MessageRecord;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import lombok.extern.slf4j.Slf4j;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;

/**
 * 编码器
 *
 * @author wjw
 * @ClassName MessageRecordEncode.java
 * @createTime 2022-04-30 09:56
 */
@Slf4j
public class MessageRecordEncode extends MessageToByteEncoder<MessageRecord> {

    @Override
    protected void encode(ChannelHandlerContext ctx, MessageRecord msg, ByteBuf out) throws Exception {
        log.info("=============开始进行消息编码=============");
        Header header = msg.getHeader();
        out.writeLong(header.getSessionId());
        out.writeByte(header.getErqType());

        Object body = msg.getBody();
        if (body != null) {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);

            oos.writeObject(body);

            byte[] bytes = bos.toByteArray();

            out.writeInt(bytes.length);
            out.writeBytes(bytes);
        } else {
            //消息长度为0
            out.writeInt(0);
        }

    }
}
