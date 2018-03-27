package com.donny.adapter7.duckturkey;


/**
 * 野生火鸡 实现了Turkey接口
 */


public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fiy() {
        System.out.println("I'm flying a short distance");
    }
}
