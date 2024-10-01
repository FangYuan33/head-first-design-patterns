package com.fy.patterns.design.chapter14.staticproxy.impl;

import com.fy.patterns.design.chapter14.staticproxy.Service;

public class StaticProxyImpl implements Service {

    private Service realService;

    public StaticProxyImpl(Service realService) {
        this.realService = realService;
    }

    @Override
    public void perform() {
        System.out.println("Proxy: Before performing real service");
        realService.perform();
        System.out.println("Proxy: After performing real service");
    }

}
