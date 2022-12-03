package com.fy.patterns.design.chapter5.factorymethod;

import com.fy.patterns.design.chapter5.*;

public class UKPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza;

        if ("UB".equals(type)) {
            pizza = new UKBigPizza();
        } else if ("US".equals(type)) {
            pizza = new UKSmallPizza();
        } else {
            throw new RuntimeException("无对应披萨");
        }

        return pizza;
    }
}
