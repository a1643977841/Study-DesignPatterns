package com.itheima.pattern.decorator;

/**
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2411:01
 */
public class Bacon extends Garnish{
    public Bacon(FastFood fastFood) {
        super(5, "培根", fastFood);
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
