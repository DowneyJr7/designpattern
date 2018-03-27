package com.donny.iterandcomp9.iterator;

public class MenuItem {
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

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public double getPrice() {
        return price;
    }
}
