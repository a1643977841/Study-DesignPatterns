package com.itheima.pattern.visitor;

/**
 * <p>
 *  抽象访问者角色类
 * </p>
 *
 * @author Liu hao
 * @version 1.0
 * @date 2022/4/6 16:58
 */
public interface Person {
    /**
     * 喂食宠物猫
     * @param cat 猫
     */
    void feed(Cat cat);

    /**
     * 喂食宠物狗
     * @param dog 狗
     */
    void feed(Dog dog);
}
