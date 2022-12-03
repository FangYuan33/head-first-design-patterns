package com.fy.patterns.design.chapter5;

public class ChinaSmallPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备一块很小的中国Pizza");
    }

    @Override
    public void box() {
        System.out.println("直接装进口袋里");
    }
}
