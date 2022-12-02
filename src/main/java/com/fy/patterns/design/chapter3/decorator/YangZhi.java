package com.fy.patterns.design.chapter3.decorator;

import java.math.BigDecimal;

public class YangZhi extends CondimentDecorator {

    /**
     * 杨枝 2块钱 + 被装饰的对象的钱
     */
    @Override
    public BigDecimal cost() {
        return BigDecimal.valueOf(2).add(beverage.cost());
    }

    @Override
    public String getDescription() {
        System.out.println("加入杨枝啦");
        String description = "杨枝" + beverage.getDescription();
        System.out.println("加完杨枝啦");

        return description;
    }
}
