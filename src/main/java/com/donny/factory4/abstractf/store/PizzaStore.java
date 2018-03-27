package com.donny.factory4.abstractf.store;

import com.donny.factory4.abstractf.pizza.Pizza;

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
