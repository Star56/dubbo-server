package com.qiwenfei.dubbo;

/**
 * 2018/6/24
 * sunshine
 * 使用dubbo自带的容器启动服务，dubbo默认使用spring容器
 */
public class Main {

    public static void main(String[] args) {
        com.alibaba.dubbo.container.Main.main(new String[]{"spring","log4j"});
    }
}
