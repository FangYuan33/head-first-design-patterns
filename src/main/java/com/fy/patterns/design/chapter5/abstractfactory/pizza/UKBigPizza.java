package com.fy.patterns.design.chapter5.abstractfactory.pizza;

import com.fy.patterns.design.chapter5.abstractfactory.ingredients.impl.UKIngredientsFactory;

public class UKBigPizza extends Pizza {

    public UKBigPizza() {
        super(new UKIngredientsFactory());
    }

    @Override
    public void prepare() {
        super.prepare();
        System.out.println("大披萨！");
    }

    @Override
    public void box() {
        System.out.println("装大盒子");
    }
}
