package com.itheima.pattern.template;

/**
 * <p>
 *  炒包菜类
 * </p>
 *
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/3122:17
 */
public class ConcreteClass_BaoCai extends AbstractClass{


    @Override
    public void pourVegetable() {
        System.out.println("下锅的蔬菜是包菜");
    }

    @Override
    public void pourSauce() {
        System.out.println("下锅的酱料是辣椒");
    }
}
