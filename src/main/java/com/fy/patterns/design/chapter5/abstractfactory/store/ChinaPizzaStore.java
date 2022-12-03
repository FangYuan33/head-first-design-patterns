package com.fy.patterns.design.chapter5.abstractfactory.store;

import com.fy.patterns.design.chapter5.abstractfactory.pizza.ChinaBigPizza;
import com.fy.patterns.design.chapter5.abstractfactory.pizza.ChinaSmallPizza;
import com.fy.patterns.design.chapter5.abstractfactory.pizza.Pizza;

public class ChinaPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
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
