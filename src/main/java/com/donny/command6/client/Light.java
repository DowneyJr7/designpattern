package com.donny.command6.client;

/**
 * Light:电灯
 */
public class Light {
    String name;

    public Light(String name){
        this.name = name;
    }

    public void on(){
        System.out.println(name + "light is On");
    }

    public void off(){
        System.out.println(name + "light is Off");
    }
}
