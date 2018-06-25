package com.qiwenfei.dubbo;

/**
 * 2018/6/24
 * sunshine
 */
public class HelloImpl implements IHello {

    @Override
    public String sayHello(String msg) {

        return  "Hello"+msg;
    }
}
