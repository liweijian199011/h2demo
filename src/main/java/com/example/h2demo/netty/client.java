package com.example.h2demo.netty;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;

/**
 * Description
 * <p>
 * </p>
 * DATE 2019/4/16.
 *
 * @author liweijian.
 */
public class client {
    public static void main(String[] args) {
        NioEventLoopGroup worker = new NioEventLoopGroup();

        Bootstrap bootstrap = new Bootstrap();
        bootstrap.group(worker)
                .channel(NioSocketChannel.class)
                .handler(new ChannelInitializer<SocketChannel>() {
                    @Override
                    public void initChannel(SocketChannel socketChannel) {
//                        connect(bootstrap, "localhost", 1000);
                    }
                });

    }

//    private static void connect(Bootstrap bootstrap, String host, int port) {
//        bootstrap.connect(host, port).addListener(future -> {
////            while (!future.isSuccess()) {
////                System.out.println("连接失败");
////                connect(bootstrap, host, port);
////            }
//            System.out.println("连接成功");
//        });
//    }
}
