package com.donny.singleton5.chocolates;

/**
 * 这是保证可行的最直接做法。对于巧克力锅炉似乎没有性能的考虑，所以可以用这个方法。
 */
public class Synchronized1 {
    private boolean empty;//空的
    private boolean boiled;//煮
    private static Synchronized1 uniqueInstance;

    private Synchronized1(){
        empty = true;
        boiled = false;
    }

    public static synchronized Synchronized1 getInstance(){
        if (uniqueInstance == null){
            uniqueInstance = new Synchronized1();
        }
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
