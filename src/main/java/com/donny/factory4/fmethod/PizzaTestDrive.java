package com.donny.factory4.fmethod;

import com.donny.factory4.fmethod.pizza.Pizza;
import com.donny.factory4.fmethod.store.ChicagoPizzaStore;
import com.donny.factory4.fmethod.store.NYPizzaStore;
import com.donny.factory4.fmethod.store.PizzaStore;

public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPiz("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPiz("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
