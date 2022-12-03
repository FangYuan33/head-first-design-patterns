package com.fy.patterns.design.chapter5.abstractfactory.pizza;

import com.fy.patterns.design.chapter5.abstractfactory.ingredients.impl.ChinaIngredientsFactory;

public class ChinaSmallPizza extends Pizza {

    public ChinaSmallPizza() {
        super(new ChinaIngredientsFactory());
    }

    @Override
    public void prepare() {
        super.prepare();
        System.out.println("准备一块小的中国Pizza");
    }

    @Override
    public void box() {
        System.out.println("装口袋里");
    }
}
