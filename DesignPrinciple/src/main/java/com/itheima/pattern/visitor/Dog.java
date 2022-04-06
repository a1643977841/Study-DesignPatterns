package com.itheima.pattern.visitor;

/**
 * <p>
 *  具体元素角色类
 * </p>
 *
 * @author Liu hao
 * @version 1.0
 * @date 2022/4/6 17:10
 */
public class Dog implements Animal {
    @Override
    public void accept(Person person) {
        person.feed(this);
        System.out.println("好好吃，汪汪汪!!!");
    }
}
