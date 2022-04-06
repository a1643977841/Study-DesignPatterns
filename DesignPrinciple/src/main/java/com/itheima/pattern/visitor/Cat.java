package com.itheima.pattern.visitor;

/**
 * <p>
 *  具体元素角色类
 * </p>
 *
 * @author Liu hao
 * @version 1.0
 * @date 2022/4/6 17:03
 */
public class Cat implements Animal{
    @Override
    public void accept(Person person) {
        // 给宠物猫喂食
        person.feed(this);
        System.out.println("好好吃，喵喵喵!!!");
    }
}
