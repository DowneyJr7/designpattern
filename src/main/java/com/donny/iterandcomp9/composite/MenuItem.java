package com.donny.iterandcomp9.composite;

import java.util.Iterator;

/**
 * 菜单选项
 */
public class MenuItem extends MenuComponent {
    private String name;
    private String description;
    private boolean vegetarian;
    private double price;

    /**
     * 构造菜单项
     * @param name 名称
     * @param description 描述
     * @param vegetarian 素食否
     * @param price 价格
     */
    public MenuItem(String name, String description, boolean vegetarian, double price){
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void print() {
        System.out.println("    " + getName());
        if (isVegetarian()){
            System.out.print("(v)");
        }
        System.out.println(", " + getPrice());
        System.out.println("    -- " + getDescription());
    }

    @Override
    public Iterator createIterator() {
        return new NullIterator();
    }
}
