package com.fy.patterns.design.chapter14.staticproxy.impl;

import com.fy.patterns.design.chapter14.staticproxy.Service;

public class ServiceImpl implements Service {

    @Override
    public void perform() {
        System.out.println("Performing real service");
    }

}
