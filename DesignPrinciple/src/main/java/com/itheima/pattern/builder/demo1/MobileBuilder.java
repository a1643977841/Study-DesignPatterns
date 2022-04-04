package com.itheima.pattern.builder.demo1;

/**
 * 具体的构建者
 * 用来构建摩拜单车对象
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2314:29
 */
public class MobileBuilder extends Builder{
    @Override
    public void builderFrame() {
        super.bike.setName("碳纤维车架");
    }

    @Override
    public void builderSeat() {
        super.bike.setSeat("真皮车座");
    }

    @Override
    public Bike createBike() {
        return super.bike;
    }
}
