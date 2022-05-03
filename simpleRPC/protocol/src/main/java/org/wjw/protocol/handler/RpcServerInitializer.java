package org.wjw.protocol.handler;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;
import org.wjw.protocol.codec.RpcDecode;
import org.wjw.protocol.codec.RpcEncoder;

/**
 * @author wjw
 * @ClassName RpcServerInitializer.java
 * @createTime 2022-05-03 20:22
 */
public class RpcServerInitializer extends ChannelInitializer<SocketChannel> {

    @Override
    protected void initChannel(SocketChannel ch) throws Exception {
        ch.pipeline()
                .addLast(new LengthFieldBasedFrameDecoder(Integer.MAX_VALUE,
                        12,
                        4,
                        0,
                        0))
                .addLast(new RpcDecode())
                .addLast(new RpcEncoder())
                .addLast(new RpcServerHandler());

    }
}
