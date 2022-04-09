package com.ah.pattern.builder.demo1;

/**
 * 抽象
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2314:26
 */
public abstract class Builder {

    protected Bike bike = new Bike();

    /**
     * 构建车架
     */
    public abstract void builderFrame();

    /**
     * 构建车座
     */
    public abstract void builderSeat();

    /**
     * 构建自行车
     * @return 自行车
     */
    public abstract Bike createBike();
}
