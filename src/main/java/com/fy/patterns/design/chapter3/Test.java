package com.fy.patterns.design.chapter3;

public class Test {
    public static void main(String[] args) {
        // 主题
        WeatherData weatherData = new WeatherData();
        // 观察者
        TemperatureLog temperatureLog = new TemperatureLog(weatherData);

        weatherData.setMeasurements(0);
        weatherData.setMeasurements(-9);

        temperatureLog.doNotLogTemperature();

        weatherData.setMeasurements(1);
    }
}
