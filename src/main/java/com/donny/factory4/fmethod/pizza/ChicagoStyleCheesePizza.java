package com.donny.factory4.fmethod.pizza;

/**
 * 奶酪披萨
 */
public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza(){
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add("Shredded Mozarella Cheese");//意大利白干酪
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
