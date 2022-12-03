package com.fy.patterns.design.chapter3;

import java.util.Observable;

/**
 * 主题
 *
 * @author FangYuan
 * @since 2022-11-29 21:33:46
 */
public class WeatherData extends Observable {

    /**
     * 北京的温度（今日降温，-9℃）
     */
    private Integer temperature;

    /**
     * 温度变化，修改温度
     */
    public void setMeasurements(Integer temperature) {
        this.temperature = temperature;
        measurementChanged();
    }

    /**
     * 测量到温度变化，通知观察者
     */
    private void measurementChanged() {
        setChanged();
        notifyObservers(temperature);
    }
}
