package com.fy.patterns.design.chapter5.abstractfactory.pizza;

import com.fy.patterns.design.chapter5.abstractfactory.ingredients.impl.UKIngredientsFactory;

public class UKSmallPizza extends Pizza {

    public UKSmallPizza() {
        super(new UKIngredientsFactory());
    }

    @Override
    public void prepare() {
        super.prepare();
        System.out.println("小披萨");
    }

    @Override
    public void box() {
        System.out.println("装装装");
    }
}
