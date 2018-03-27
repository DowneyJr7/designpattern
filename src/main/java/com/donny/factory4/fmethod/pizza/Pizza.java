package com.donny.factory4.fmethod.pizza;

import java.util.ArrayList;


/**
 * 比萨
 */
public abstract class Pizza {

    String name;//名称
    String dough;//面团类型
    String sauce;//酱料类型
    ArrayList toppings = new ArrayList();//佐料

    /**
     * 准备
     */
    public void prepare(){
        System.out.println("Prepare " + name);
        System.out.println("Tossing dough... ");
        System.out.println("Adding sauce... ");
        System.out.println("Adding toppings:");
        for (int i = 0; i < toppings.size(); i++){
            System.out.println("    " + toppings.get(i));
        }
    }

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

    public String getName() {
        return name;
    }
}
