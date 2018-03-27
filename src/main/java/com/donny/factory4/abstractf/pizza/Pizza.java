package com.donny.factory4.abstractf.pizza;

import com.donny.factory4.abstractf.ingredient.cheese.Cheese;
import com.donny.factory4.abstractf.ingredient.clams.Clams;
import com.donny.factory4.abstractf.ingredient.dough.Dough;
import com.donny.factory4.abstractf.ingredient.pepperoni.Pepperoni;
import com.donny.factory4.abstractf.ingredient.sauce.Sauce;
import com.donny.factory4.abstractf.ingredient.veggies.Veggies;

/**
 * 比萨
 */
public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies[] veggies;
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;

    /**
     * 准备
     */
    public abstract void prepare();

    /**
     * 烘焙
     */
    public void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }

    /**
     * 切片
     */
    public void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }

    /**
     * 装盒
     */
    public void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
