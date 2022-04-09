package com.ah.pattern.mediator;

/**
 * <p>
 *  具体的同事角色类
 * </p>
 *
 * @author Liu hao
 * @version 1.0
 * @date 2022/4/5 21:59
 */
public class Tenant extends Person{


    public Tenant(String name, Mediator mediator) {
        super(name, mediator);
    }

    /**
     * 和中介联系(沟通)
     * @param message 消息
     */
    public void constact(String message) {
        mediator.constact(message, this);
    }

    /**
     * 获取信息
     * @param message 信息
     */
    public void getMessage(String message) {
        System.out.println("租房者" + super.name + "获取到的信息：" + message);
    }
}
