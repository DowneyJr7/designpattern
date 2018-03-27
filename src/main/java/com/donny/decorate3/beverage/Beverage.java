package com.donny.decorate3.beverage;

/**
 * 抽象组件
 * 饮料
 */
public abstract class Beverage {
    protected String description = "Unknown Beverage";//描述

    private int size;
    public static final int TALL = 0;//小
    public static final int GRANDE = 1;//中
    public static final int VENTI = 2;//大

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
