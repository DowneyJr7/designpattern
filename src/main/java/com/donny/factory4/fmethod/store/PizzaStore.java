package com.donny.factory4.fmethod.store;

import com.donny.factory4.fmethod.pizza.Pizza;


/**
 * 比萨店
 */


public abstract class PizzaStore {

    public Pizza orderPiz(String type){
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public abstract Pizza createPizza(String type);
}
