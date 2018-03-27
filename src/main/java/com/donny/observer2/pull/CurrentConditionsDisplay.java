package com.donny.observer2.pull;

import com.donny.observer2.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * 现状布告板
 * 实现了Observer接口(内置)
 * 也实现了DisplayElement接口，API规定所有布告板都必须实现此接口
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    Observable observable;
    private float temperature;
    private float humidity;
    private float pressure;

    /**
     *
     * @param observable 注册之用
     */
    public CurrentConditionsDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature +
                "F degrees and " + humidity + "% humidity and " + pressure);
    }

    /**
     *
     * @param o
     * @param arg 数据对象
     */
    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData weatherData = (WeatherData)o;//若o不是WeatherData类型，要重写？
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();//拉数据？

            this.pressure = weatherData.getPressure();
            display();
        }
    }
}
