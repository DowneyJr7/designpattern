package com.donny.factory4.fmethod.pizza;

/**
 * 奶酪披萨
 */
public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza(){
        name = "NY Style auce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";//Marinara 大蒜番茄酱
        toppings.add("Grated Reggiano Cheese");//意大利Reggiano高级干酪
    }
}
