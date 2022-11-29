package com.fy.patterns.design.chapter2;

import java.util.Observable;
import java.util.Observer;

/**
 * 温度观察者
 *
 * @author FangYuan
 * @since 2022-11-29 21:37:17
 */
public class TemperatureLog implements Observer {

    private final Observable observable;

    /**
     * 直接添加到主题的观察者列表
     *
     * @param observable 订阅的主题
     */
    public TemperatureLog(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    /**
     * 取消订阅
     */
    public void doNotLogTemperature() {
        observable.deleteObserver(this);
    }

    public void update(Observable o, Object arg) {
        if (arg instanceof Integer) {
            Integer temperature = (Integer) arg;

            System.out.println("当前温度: " + temperature);
        }
    }
}
