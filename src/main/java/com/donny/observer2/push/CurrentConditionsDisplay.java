package com.donny.observer2.push;

import com.donny.observer2.DisplayElement;


/**
 * 现状布告板
 * 实现了Observer接口(外置)，所以可以从WeatherData对象中获得改变
 * 也实现了DisplayElement接口，API规定所有布告板都必须实现此接口
 */


public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private Subject weatherData;

    /**
     *
     * @param weatherData 注册之用
     */
    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature +
                "F degrees and " + humidity + "% humidity");
    }


    /**
     * 更新数据
     * @param temperature
     * @param humidity
     * @param pressuer
     */


    @Override
    public void update(float temperature, float humidity, float pressuer) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
