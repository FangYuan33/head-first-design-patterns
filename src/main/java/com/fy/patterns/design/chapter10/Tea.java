package com.fy.patterns.design.chapter10;

public class Tea extends CaffeineBeverage {
    @Override
    protected void brew() {
        System.out.println("沏茶");
    }

    @Override
    protected void addCondiments() {
        System.out.println("加柠檬片儿");
    }
}
