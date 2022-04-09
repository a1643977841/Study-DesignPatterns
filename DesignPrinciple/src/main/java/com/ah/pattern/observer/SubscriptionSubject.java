package com.ah.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  具体主题角色
 * </p>
 *
 * @author Liu hao
 * @version 1.0
 * @date 2022/4/5 21:07
 */
public class SubscriptionSubject implements Subject{
    /**
     * 定义一个集合，用来存储多个观察者
     */
    private final List<Observer> observers = new ArrayList<>();


    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notify(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
