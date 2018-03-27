package com.donny.decorate3.beverage.condiment;

import com.donny.decorate3.beverage.Beverage;

/**
 * 抽象装饰者
 * 调料
 */
public abstract class CondimentDecorator extends Beverage {

    public abstract String getDescription();
    public abstract int getSize();
}
