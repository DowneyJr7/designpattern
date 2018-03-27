package com.donny.decorate3.beverage.condiment;


import com.donny.decorate3.beverage.Beverage;

/**
 * 奶泡
 */
public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
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
