package com.itheima.pattern.decorator;

/**
 * 具体构建角色----炒饭
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2410:44
 */
public class FriedRice extends FastFood{


    public FriedRice() {
        super(10,"炒饭");
    }

    @Override
    public float cast() {
        return getPrice();
    }
}
