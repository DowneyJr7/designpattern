package com.donny.strategy1;


/**
 * 不实现鸭子飞行
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can not fiying!");
    }
}
