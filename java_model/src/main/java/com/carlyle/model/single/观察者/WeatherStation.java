package com.carlyle.model.single.观察者;

/***
 * 
 * 类图
主题（Subject）具有注册和移除观察者、并通知所有注册者的功能，主题是通过维护一张观察者列表来实现这些操作的。

观察者（Observer）的注册功能需要调用主题的 registerObserver() 方法。
 * 
 * 
 * **/
/**
 * @author Carlyle
 * @Date 2018年6月8日 下午3:19:58
 * @Description:
 * 
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(0, 0, 0);
        weatherData.setMeasurements(1, 1, 1);

    }
}