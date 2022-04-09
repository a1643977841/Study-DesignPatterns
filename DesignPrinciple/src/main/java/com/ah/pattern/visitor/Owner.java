package com.ah.pattern.visitor;

/**
 * <p>
 *  具体访问者角色类
 * </p>
 *
 * @author Liu hao
 * @version 1.0
 * @date 2022/4/6 17:11
 */
public class Owner implements Person {
    @Override
    public void feed(Cat cat) {
        System.out.println("主人喂食猫");
    }

    @Override
    public void feed(Dog dog) {
        System.out.println("主人喂食狗");
    }
}
