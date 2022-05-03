package org.wjw.protocol.handler;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import org.wjw.protocol.core.RpcProtocol;
import org.wjw.protocol.core.RpcRequest;

/**
 * @author wjw
 * @ClassName RpcServerHandler.java
 * @createTime 2022-05-03 20:32
 */
public class RpcServerHandler extends SimpleChannelInboundHandler<RpcProtocol<RpcRequest>> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, RpcProtocol<RpcRequest> msg) throws Exception {

    }
}
