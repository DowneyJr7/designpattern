package com.donny.decorate3.beverage.coffee;

import com.donny.decorate3.beverage.Beverage;

/**
 * 低咖啡因
 */
public class Decaf extends Beverage {

    public Decaf(){
        description = "Decaf Coffee";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
