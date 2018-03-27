package com.donny.decorate3.beverage.coffee;

import com.donny.decorate3.beverage.Beverage;

/**
 * 浓缩
 */
public class Espresso extends Beverage {

    public Espresso(){
        description = "Espresso Coffee";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
