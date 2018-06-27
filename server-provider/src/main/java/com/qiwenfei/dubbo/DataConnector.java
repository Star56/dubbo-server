package com.qiwenfei.dubbo;

import com.qiwenfei.spi.DataDriver;

import java.util.ServiceLoader;

/**
 * 2018/6/27
 * sunshine
 * spi服务提供：
 * 厂商定义接口：弟三方实现
 * 实现方式是：
 * （1）导入厂商jar
 * （2）编写实现类
 * （3）在resource目录下建立一个包META-INF.services
 * （4）在包下新建一个文件名称为spi服务全路径
 * （5）文件里面填写实现类的全路径
 */
public class DataConnector {
    public static void main(String[] args) {
        ServiceLoader<DataDriver> dataDrivers =
                ServiceLoader.load(DataDriver.class);

        for (DataDriver dataDriver:dataDrivers
             ) {
            System.out.println(dataDriver.connect("localhost"));
        }
    }
}
