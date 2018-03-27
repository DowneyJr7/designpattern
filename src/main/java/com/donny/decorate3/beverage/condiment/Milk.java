package com.donny.decorate3.beverage.condiment;

import com.donny.decorate3.beverage.Beverage;

/**
 * 牛奶
 */
public class Milk extends CondimentDecorator {

    Beverage beverage;

    public Milk(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public int getSize() {
        return beverage.getSize();
    }

    @Override
    public double cost() {
        return 0.10 + beverage.cost();
    }
}
