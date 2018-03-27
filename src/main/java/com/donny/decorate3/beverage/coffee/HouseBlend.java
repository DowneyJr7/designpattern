package com.donny.decorate3.beverage.coffee;

import com.donny.decorate3.beverage.Beverage;

/**

 * 具体组件


 * 综合
 */
public class HouseBlend extends Beverage {

    public HouseBlend(){
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
