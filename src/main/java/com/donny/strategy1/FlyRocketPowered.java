package com.donny.strategy1;


/**
 * 实现火箭飞行
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I am flying with a rocket!");
    }
}
