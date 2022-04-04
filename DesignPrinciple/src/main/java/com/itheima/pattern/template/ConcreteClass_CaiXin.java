package com.itheima.pattern.template;

/**
 * <p>
 *  炒菜心
 * </p>
 *
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/3122:19
 */
public class ConcreteClass_CaiXin extends AbstractClass{

    @Override
    public void pourVegetable() {
        System.out.println("下锅的蔬菜是菜心");
    }

    @Override
    public void pourSauce() {
        System.out.println("下锅的酱料是蒜蓉");
    }
}
