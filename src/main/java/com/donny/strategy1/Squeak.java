package com.donny.strategy1;


/**
 * 实现吱吱叫
 */


public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
