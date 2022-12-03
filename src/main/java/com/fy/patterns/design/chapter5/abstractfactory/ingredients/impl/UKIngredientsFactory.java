package com.fy.patterns.design.chapter5.abstractfactory.ingredients.impl;

import com.fy.patterns.design.chapter5.abstractfactory.ingredients.Cheese;
import com.fy.patterns.design.chapter5.abstractfactory.ingredients.IngredientsFactory;
import com.fy.patterns.design.chapter5.abstractfactory.ingredients.Veggie;

public class UKIngredientsFactory implements IngredientsFactory {
    @Override
    public Cheese createCheese() {
        return new UKCheese();
    }

    @Override
    public Veggie createVeggie() {
        return new UKVeggie();
    }
}
