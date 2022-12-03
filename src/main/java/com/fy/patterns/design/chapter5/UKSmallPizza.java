package com.fy.patterns.design.chapter5;

public class UKSmallPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备一块小巴掌英国Pizza");
    }

    @Override
    public void box() {
        System.out.println("没盒子，直接拿着吃吧");
    }
}
