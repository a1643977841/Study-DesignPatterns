package com.ah.pattern.observer;

/**
 * <p>
 *  抽象观察者类
 * </p>
 *
 * @author Liu hao
 * @version 1.0
 * @date 2022/4/5 21:00
 */
public interface Observer {

    /**
     * 更新方法
     * @param message 消息
     */
    void update(String message);

}
