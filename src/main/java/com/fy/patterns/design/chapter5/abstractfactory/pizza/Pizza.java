package com.fy.patterns.design.chapter5.abstractfactory.pizza;

import com.fy.patterns.design.chapter5.abstractfactory.ingredients.IngredientsFactory;

/**
 * 在抽象工厂模式中，添加原料工厂进来，以制造一批！原料
 * <p>
 * 产品的抽象类
 * 披萨 - 准备 和 装箱 抽象方法由子类去做具体的实现
 */
public abstract class Pizza {

    private final IngredientsFactory ingredientsFactory;

    public Pizza(IngredientsFactory ingredientsFactory) {
        this.ingredientsFactory = ingredientsFactory;
    }

    public void prepare() {
        ingredientsFactory.createCheese();
        ingredientsFactory.createVeggie();
        System.out.println("原料已就绪");
    }

    public abstract void box();
}
