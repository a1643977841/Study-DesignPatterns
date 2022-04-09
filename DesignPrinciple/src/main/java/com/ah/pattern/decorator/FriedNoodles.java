package com.ah.pattern.decorator;

/**
 * 具体构建角色---炒面
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2410:48
 */
public class FriedNoodles extends FastFood{

    public FriedNoodles() {
        super(12, "炒面");
    }

    @Override
    public float cast() {
        return getPrice();
    }
}
