package com.donny.singleton5.classic;

public class DoubleCheckedLocking3 {
    //volatile:当uniqueInstance变量被初始化成DoubleCheckedLocking3实例时，
    // 多个线程正确地处理uniqueInstance变量
    private volatile static DoubleCheckedLocking3 uniqueInstance;

    private DoubleCheckedLocking3() {
    }

    public static synchronized DoubleCheckedLocking3 getInstance() {
        //检查实例，如果不存在，就进入同步区块。
        if (uniqueInstance == null) {
            //注意，只有第一次才彻底执行这里的代码
            synchronized (DoubleCheckedLocking3.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new DoubleCheckedLocking3();
                }
            }
        }
        return uniqueInstance;
    }
}
