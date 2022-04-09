package com.ah.pattern.decorator;

/**
 * 抽象装饰角色
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2410:49
 */
public abstract class Garnish extends FastFood{

    private FastFood fastFood;

    public Garnish(float price, String desc, FastFood fastFood) {
        super(price, desc);
        this.fastFood = fastFood;
    }

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }
}
