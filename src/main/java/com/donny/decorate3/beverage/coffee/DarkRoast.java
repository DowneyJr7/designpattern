package com.donny.decorate3.beverage.coffee;

import com.donny.decorate3.beverage.Beverage;

/**
 * 深焙
 */
public class DarkRoast extends Beverage {

    public DarkRoast(){
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
