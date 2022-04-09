package com.ah.pattern.visitor;

/**
 * <p>
 *  抽象元素角色类
 * </p>
 *
 * @author Liu hao
 * @version 1.0
 * @date 2022/4/6 17:00
 */
public interface Animal {
    /**
     * 接受指定访问者来访问
     * @param person 访问者
     */
    void accept(Person person);
}
