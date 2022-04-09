package com.ah.pattern.mediator;

/**
 * <p>
 *  抽象同事类
 * </p>
 *
 * @author Liu hao
 * @version 1.0
 * @date 2022/4/5 21:49
 */
public abstract class Person {
    protected String name;

    protected Mediator mediator;


    public Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
}
