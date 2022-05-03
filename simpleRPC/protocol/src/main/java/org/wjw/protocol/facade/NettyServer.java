package org.wjw.protocol.facade;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.sctp.nio.NioSctpServerChannel;
import lombok.extern.slf4j.Slf4j;
import org.wjw.protocol.handler.RpcServerInitializer;

import java.util.EventListener;

/**
 * @author wjw
 * @ClassName NeetServer.java
 * @createTime 2022-05-03 20:15
 */
@Slf4j
public class NettyServer {

    private String serverAddress;

    private int serverPort;

    public void startNettyServer() {
        log.info("begin start Netty server");
        EventLoopGroup boss = new NioEventLoopGroup();
        EventLoopGroup worker = new NioEventLoopGroup();

        ServerBootstrap bootstrap = new ServerBootstrap();

        bootstrap.group(boss, worker)
                .channel(NioSctpServerChannel.class)
                .childHandler(new RpcServerInitializer());

        try {
            bootstrap.bind(this.serverAddress, this.serverPort).sync();
            log.info("Server started Success on port,{}", this.serverPort);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            boss.shutdownGracefully();
            worker.shutdownGracefully();

        }

    }


}
