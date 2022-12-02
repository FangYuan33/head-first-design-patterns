package com.fy.patterns.design.chapter3.decorator;

import java.math.BigDecimal;

public class GanLu extends CondimentDecorator {

    /**
     * 甘露 3块钱 + 被装饰者的钱
     */
    @Override
    public BigDecimal cost() {
        return BigDecimal.valueOf(3).add(beverage.cost());
    }

    @Override
    public String getDescription() {
        System.out.println("甘露兑水!");

        return "甘露" + beverage.getDescription();
    }
}
