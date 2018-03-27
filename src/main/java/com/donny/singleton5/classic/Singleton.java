package com.donny.singleton5.classic;


/**
 * 经典的单件模式
 */


public class Singleton {
    //利用一个静态变量来记录Singleton类的唯一实例
    private static Singleton uniqueInstance;

    /**
     * 把构造器声明为私有的，只有自Singleton类内才可以调用构造器
     */
    private Singleton(){};

    /**
     * 实例化对象
     * @return
     */
    public static Singleton getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new Singleton();
        }//延迟实例化,lazyinstantiaze
        return uniqueInstance;
    }
}
