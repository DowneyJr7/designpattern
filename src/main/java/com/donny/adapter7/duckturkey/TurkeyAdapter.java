package com.donny.adapter7.duckturkey;


/**
 * 火鸡适配器
 * 火鸡 转 鸭子
 */


public class TurkeyAdapter implements Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++){
            turkey.fiy();
        }
    }
}
