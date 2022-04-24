package com.wjw.buff;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.ByteBufUtil;

/**
 * @author wjw
 * @ClassName NettyByteBuffExample.java
 * @createTime 2022-04-24 21:55
 */
public class NettyByteBuffExample {

    private static ByteBuf bufBuild() {
        return ByteBufAllocator.DEFAULT.heapBuffer();
//        return ByteBufAllocator.DEFAULT.directBuffer();
    }

    public static void main(String[] args) {
        ByteBuf buf = bufBuild();
        System.out.println("========before========");
        log(buf);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 100; i++) {
            sb.append("-" + i);
        }

        buf.writeBytes(sb.toString().getBytes());
        System.out.println("========after========");
        log(buf);
    }

    private static void log(ByteBuf buf) {
        StringBuilder sb = new StringBuilder();
        sb.append(" read index: ").append(buf.readerIndex());
        sb.append(" write index: ").append(buf.writerIndex());
        sb.append(" capacity").append(buf.capacity());
        ByteBufUtil.appendPrettyHexDump(sb, buf);
        System.out.println(sb.toString());
    }
}
