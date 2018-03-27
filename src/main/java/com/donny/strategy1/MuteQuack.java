package com.donny.strategy1;


/**
 * 实现不会叫
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
