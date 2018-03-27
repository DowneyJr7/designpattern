package com.donny.observer2.pull;

import java.util.Observable;

/**
 * 天气数据 继承了Observable
 */

import com.donny.observer2.push.Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class WeatherData extends Observable {
    private float temperature;//温度
    private float humidity;//湿度
    private float pressure;//气压

    public WeatherData(){

    }

    /**
     * 当从气象站得到更新观测值时，我们通知观察者
     */
    public void measurementsChanged() {
        setChanged();//用来标记状态已经改变的事实
        notifyObservers();//拉
//        notifyObservers("Observable");//推
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
