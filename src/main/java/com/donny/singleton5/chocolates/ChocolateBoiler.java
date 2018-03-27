package com.donny.singleton5.chocolates;

/**
 * 巧克力工厂
 */
public class ChocolateBoiler {
    private boolean empty;//空的
    private boolean boiled;//煮

    public ChocolateBoiler(){
        empty = true;
        boiled = false;
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
