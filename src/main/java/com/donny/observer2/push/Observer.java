package com.donny.observer2.push;

/**
 * 观察者
 */
public interface Observer {
    /**
     * 一旦Subject改变，Observer随即更新
     * @param temperature
     * @param humidity
     * @param pressuer
     */
    void update(float temperature, float humidity, float pressuer);
}
