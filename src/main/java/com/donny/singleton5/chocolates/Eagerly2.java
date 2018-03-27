package com.donny.singleton5.chocolates;

/**
 * 我们一定需要用到一个巧克力锅炉所以静态地初始化实例并不是不可以。
 * 虽然对于采用标准模式的开发人员来说，此做法可能稍微陌生一点。但它还是可行。
 */
public class Eagerly2 {
    private boolean empty;//空的
    private boolean boiled;//煮
    //使用“急切”创建实例，在静态初始器(static initializer)中创建单件。保证了线程安全(thread sate)。
    private static Eagerly2 uniqueInstance = new Eagerly2();

    private Eagerly2(){
        empty = true;
        boiled = false;
    }

    public static Eagerly2 getInstance(){
        return uniqueInstance;
    }

    /**
     * fill 填满
     * 在锅炉内填满巧克力和牛奶混合物
     */
    public void fill(){
        if (isEmpty()){
            empty = true;
        }
    }

    /**
     * drain 排出
     * 排出煮沸的巧克力和牛奶
     */
    public void drain(){
        if (!isEmpty() && isBoiled()){
            empty = true;
        }
    }

    /**
     * boil 煮沸
     * 将炉内物煮沸
     */
    public void boil(){
        if (!isEmpty() && !isBoiled()){
            boiled = true;
        }
    }

    public boolean isEmpty(){
        return empty;
    }

    public boolean isBoiled(){
        return boiled;
    }
}
