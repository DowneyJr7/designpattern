package com.donny.strategy1;


/**
 * 鸭子 SupperClass
 */
public abstract class Duck {
    FlyBehavior flyBehavior;//飞 行为
    QuackBehavior quackBehavior;//嘎嘎叫 行为

    public Duck(){

    }

    public abstract void display();


    /**
     * 执行飞
     */
    public void performFly(){
        flyBehavior.fly();
    }


    /**
     * 执行叫
     */
    public void performQuack(){
        quackBehavior.quack();
    }


    /**
     * 游泳 所有鸭子都会
     */
    public void swin(){
        System.out.println("All ducks float, even decoys!");
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
