package com.donny.singleton5.classic;

public class Eagerly2 {
    //使用“急切”创建实例，在静态初始器(static initializer)中创建单件。保证了线程安全(thread sate)。
    private static Eagerly2 uniqueInstance = new Eagerly2();

    /**
     * 把构造器声明为私有的，只有自Singleton类内才可以调用构造器
     */
    private Eagerly2(){};

    /**
     * 实例化对象
     * @return
     */
    public static Eagerly2 getInstance(){
        return uniqueInstance;
    }
}
