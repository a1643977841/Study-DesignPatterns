package com.ah.pattern.decorator;

/**
 * 鸡蛋类---具体装饰者角色
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2410:52
 */
public class Egg extends Garnish{


    public Egg(FastFood fastFood) {
        super(1, "鸡蛋", fastFood);
    }

    @Override
    public float cast() {
        // 计算价格
        return getPrice() + getFastFood().cast();
    }


    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }
}
