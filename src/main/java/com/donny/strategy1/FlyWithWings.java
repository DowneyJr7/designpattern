package com.donny.strategy1;


/**
 * 实现鸭子飞行
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I am fiying!");
    }
}
