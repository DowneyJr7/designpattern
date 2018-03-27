package com.donny.singleton5.chocolates;

/**
 * 由于没有性能上的考虑，所以这个方法似乎杀鸡用了牛刀。另外，采用这个方法还得确定使用的是Java5以上的版本。
 */
public class DoubleCheckedLocking3 {
    private boolean empty;//空的
    private boolean boiled;//煮
    private volatile static DoubleCheckedLocking3 uniqueInstance;

    private DoubleCheckedLocking3() {
        empty = true;
        boiled = false;
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

    /**
     * fill 填满
     * 在锅炉内填满巧克力和牛奶混合物
     */
    public void fill() {
        if (isEmpty()) {
            empty = true;
        }
    }

    /**
     * drain 排出
     * 排出煮沸的巧克力和牛奶
     */
    public void drain() {
        if (!isEmpty() && isBoiled()) {
            empty = true;
        }
    }

    /**
     * boil 煮沸
     * 将炉内物煮沸
     */
    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
