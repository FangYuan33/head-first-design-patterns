package com.fy.patterns.design.chapter5.factorymethod;

import com.fy.patterns.design.chapter5.ChinaBigPizza;
import com.fy.patterns.design.chapter5.ChinaSmallPizza;
import com.fy.patterns.design.chapter5.Pizza;

public class ChinaPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza;

        if ("CB".equals(type)) {
            pizza = new ChinaBigPizza();
        } else if ("CS".equals(type)) {
            pizza = new ChinaSmallPizza();
        } else {
            throw new RuntimeException("无对应披萨");
        }

        return pizza;
    }
}
