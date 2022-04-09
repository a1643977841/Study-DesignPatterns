package com.ah.pattern.visitor;

/**
 * <p>
 *  具体访问者类
 * </p>
 *
 * @author Liu hao
 * @version 1.0
 * @date 2022/4/6 17:12
 */
public class Someone implements Person{
    @Override
    public void feed(Cat cat) {
        System.out.println("其他人喂食猫");
    }

    @Override
    public void feed(Dog dog) {
        System.out.println("其他人喂食狗");
    }
}
