package com.donny.observer2.push;

import java.util.ArrayList;
import java.util.List;

/**
 * 天气数据 实现了主题接口
 */
public class WeatherData implements Subject {

    private List<Observer> observers; //记录观察者
    private float temperature;//温度
    private float humidity;//湿度
    private float pressure;//气压

    public WeatherData(){
        observers = new ArrayList<Observer>();
    }

    /**
     * 当注册观察者时，我们只要把它加到ArrayList的后面即可
     * @param o
     */
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    /**
     * 当移除观察者时，我们只要把它从ArrayList中删除即可
     * @param o
     */
    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0){
            observers.remove(i);
        }
    }

    /**
     * 我们把状态告诉每一个观察者。
     */
    @Override
    public void notifyObservers() {
        for(int i = 0; i < observers.size(); i++){
            Observer observer = observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    /**
     * 当从气象站得到更新观测值时，我们通知观察者
     */
    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    // WeatherDta的其他方法
}
