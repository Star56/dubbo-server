package com.qiwenfei.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * 2018/6/24
 * sunshine
 */
public class BootStrap {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext
                        ("META_INF/spring/dubbo-server.xml");
        context.start();

        //阻塞线程
        System.in.read();
    }
}
