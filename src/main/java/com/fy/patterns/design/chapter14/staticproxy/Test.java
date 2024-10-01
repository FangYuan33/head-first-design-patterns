package com.fy.patterns.design.chapter14.staticproxy;

import com.fy.patterns.design.chapter14.staticproxy.impl.ServiceImpl;
import com.fy.patterns.design.chapter14.staticproxy.impl.StaticProxyImpl;

public class Test {
    public static void main(String[] args) {
        ServiceImpl realService = new ServiceImpl();
        StaticProxyImpl staticProxy = new StaticProxyImpl(realService);
        staticProxy.perform();
    }
}
