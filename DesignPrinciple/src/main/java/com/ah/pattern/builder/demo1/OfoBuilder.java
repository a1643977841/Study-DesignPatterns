package com.ah.pattern.builder.demo1;

/**
 * 具体构建者
 * 用来构建OFO单车
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2314:31
 */
public class OfoBuilder extends Builder{
    @Override
    public void builderFrame() {
        super.bike.setName("铝合金车架");
    }

    @Override
    public void builderSeat() {
        super.bike.setSeat("橡胶车座");
    }

    @Override
    public Bike createBike() {
        return super.bike;
    }
}
