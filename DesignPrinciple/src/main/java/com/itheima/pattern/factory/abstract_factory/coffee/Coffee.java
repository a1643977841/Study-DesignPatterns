package com.itheima.pattern.factory.abstract_factory.coffee;

/**
 * 咖啡类
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2222:51
 */
public abstract class Coffee {
    /**
     * 获取咖啡名称
     * @return nick
     */
    public abstract String getName();

    public void addSugar(){
        System.out.println("加糖");
    }

    public void addMilk(){
        System.out.println("加奶");
    }
}
