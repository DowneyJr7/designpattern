package com.donny.observer2.push;


/**
 * 主题
 */
public interface Subject {
    /**
     * 当注册观察者时，我们只要把它加到ArrayList的后面即可
     * @param o
     */
    void registerObserver(Observer o);

    /**
     * 当移除观察者时，我们只要把它从ArrayList中删除即可
     * @param o
     */
    void removeObserver(Observer o);

    /**
     * 我们把状态告诉每一个观察者。
     */
    void notifyObservers();
}
