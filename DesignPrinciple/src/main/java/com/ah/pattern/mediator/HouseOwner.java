package com.ah.pattern.mediator;

/**
 * <p>
 *  具体的同事角色类
 * </p>
 *
 * @author Liu hao
 * @version 1.0
 * @date 2022/4/5 22:02
 */
public class HouseOwner extends Person{

    public HouseOwner(String name, Mediator mediator) {
        super(name, mediator);
    }

    /**
     * 和中介者联系
     * @param message 消息
     */
    public void constact(String message) {
        mediator.constact(message, this);
    }

    /**
     * 获取信息
     * @param message 消息
     */
    public void getMessage(String message) {
        System.out.println("房主" + name + "获取到的信息：" + message);
    }
}
