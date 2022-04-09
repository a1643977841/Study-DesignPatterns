package com.ah.pattern.observer;

/**
 * <p>
 *  抽象主题角色类
 * </p>
 *
 * @author Liu hao
 * @version 1.0
 * @date 2022/4/5 21:00
 */
public interface Subject {

    /**
     * 添加订阅者
     * @param observer 具体订阅者
     */
    void attach(Observer observer);

    /**
     * 删除订阅者
     * @param observer 具体订阅者
     */
    void detach(Observer observer);

    /**
     * 通知订阅者或更新消息
     * @param message 消息
     */
    void notify(String message);

}
