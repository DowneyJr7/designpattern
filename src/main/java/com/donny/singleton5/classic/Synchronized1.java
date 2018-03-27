package com.donny.singleton5.classic;

public class Synchronized1 {
    //利用一个静态变量来记录Singleton类的唯一实例
    private static Synchronized1 uniqueInstance;

    /**
     * 把构造器声明为私有的，只有自Singleton类内才可以调用构造器
     */
    private Synchronized1(){};

    /**
     * 实例化对象
     * @return
     */
    public static synchronized Synchronized1 getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new Synchronized1();
        }//延迟实例化,lazyinstantiaze
        return uniqueInstance;
    }
}
