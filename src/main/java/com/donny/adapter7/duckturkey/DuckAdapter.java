package com.donny.adapter7.duckturkey;

import java.util.Random;

/**
 * 鸭子适配器
 * 鸭子 转 火鸡
 */
public class DuckAdapter implements Turkey {
    Duck duck;
    Random random;

    public DuckAdapter(Duck duck){
        this.duck = duck;
        random = new Random();
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fiy() {
        if (random.nextInt(5) == 0){
            duck.fly();
        }
    }
}
