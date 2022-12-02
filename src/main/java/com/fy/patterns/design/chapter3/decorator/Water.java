package com.fy.patterns.design.chapter3.decorator;

import java.math.BigDecimal;

/**
 * 水
 */
public class Water extends Beverage {
    @Override
    public String getDescription() {
        return "水";
    }

    @Override
    public BigDecimal cost() {
        return BigDecimal.valueOf(1);
    }
}
