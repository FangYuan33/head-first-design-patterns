package com.fy.patterns.design.chapter5;

public class ChinaBigPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备一块巨大的中国Pizza");
    }

    @Override
    public void box() {
        System.out.println("装进大盒子里");
    }
}
