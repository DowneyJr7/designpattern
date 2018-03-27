package com.donny.strategy1;


/**
 * 实现嘎嘎叫
 */


public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
