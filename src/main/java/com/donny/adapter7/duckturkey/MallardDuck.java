package com.donny.adapter7.duckturkey;


/**
 *  绿头鸭
 */


public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I am flying");
    }
}
