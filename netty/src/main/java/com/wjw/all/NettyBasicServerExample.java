package com.wjw.all;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;

/**
 * @author wjw
 * @ClassName NettyBasicServerExample.java
 * @createTime 2022-04-21 21:38
 */
public class NettyBasicServerExample {

    public static void main(String[] args) {
        //主线程主
        EventLoopGroup bossGroup = new NioEventLoopGroup(1);
        //表示工作线程组(register)
        EventLoopGroup workGroup = new NioEventLoopGroup(4);
        //构建Netty Server的API
        ServerBootstrap bootstrap = new ServerBootstrap();
        //Bootstrap
        bootstrap.group(bossGroup, workGroup)
                //指定epoll模型
                .channel(NioServerSocketChannel.class)
                //具体的工作处理类,负责处理相关SocketChannel的IO就绪事件
                .childHandler(new ChannelInitializer<SocketChannel>() {
                    @Override
                    protected void initChannel(SocketChannel ch) throws Exception {
                        //心跳的hander
                        //编解码
                        //协议处理
                        //消息处理
                        ch.pipeline()
                                .addLast("h1", new NormalMessageHandler())
                                .addLast("h2", new ChannelInboundHandlerAdapter() {
                                    @Override
                                    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
                                        System.out.println("收到消息------------第二处理器");
                                    }
                                }); //处理IO事件
                    }
                });
        try {
            //同步阻塞等到客户端连接
            ChannelFuture channelFuture = bootstrap.bind(8080).sync();
            System.out.println("Netty Server Started Success:listener port:8080");
            //同步等到服务端监听端口关闭
            channelFuture.channel().closeFuture().sync();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            //释放资源
            workGroup.shutdownGracefully();
            bossGroup.shutdownGracefully();
        }

    }

}
