package com.fy.patterns.design.chapter3.decorator;

import java.math.BigDecimal;

/**
 * 饮料
 */
public abstract class Beverage {

    public abstract String getDescription();

    /**
     * 需要花费的钱
     */
    public abstract BigDecimal cost();
}
