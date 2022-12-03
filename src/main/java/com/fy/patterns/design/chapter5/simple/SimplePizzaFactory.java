package com.fy.patterns.design.chapter5.simple;

import com.fy.patterns.design.chapter5.*;

public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza;

        if ("CB".equals(type)) {
            pizza = new ChinaBigPizza();
        } else if ("CS".equals(type)) {
            pizza = new ChinaSmallPizza();
        } else if ("UB".equals(type)) {
            pizza = new UKBigPizza();
        } else if ("US".equals(type)) {
            pizza = new UKSmallPizza();
        } else {
            throw new RuntimeException("无对应披萨");
        }

        return pizza;
    }
}
