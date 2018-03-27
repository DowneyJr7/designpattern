package com.donny.command6.client;

/**
 * CeilingFan:吊扇
 */
public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String name;
    int speed;

    public CeilingFan(String name){
        this.name = name;
        speed = OFF;
    }

    /**
     * 高
     */
    public void high(){
        speed = HIGH;
        System.out.println(name + "ceiling fan is on " + speed);
    }

    /**
     * 中
     */
    public void medium(){
        speed = MEDIUM;
        System.out.println(name + "ceiling fan is on " + speed);
    }

    /**
     * 低
     */
    public void low(){
        speed = LOW;
        System.out.println(name + "ceiling fan is on " + speed);
    }

    public void off(){
        System.out.println(name + "ceiling fan is off");
    }

    /**
     * 速度
     */
    public int getSpeed(){
        return speed;
    }
}
