package com.fy.patterns.design.chapter5;

public class UKBigPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备一块巨大的英国Pizza");
    }

    @Override
    public void box() {
        System.out.println("放进盒子里，加保鲜膜，够好朋友吃几天");
    }
}
