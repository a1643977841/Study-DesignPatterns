package com.itheima.pattern.builder.demo1;

/**
 * 指挥者类
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2314:33
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    /**
     * 创建自行车
     * @return nick
     */
    public Bike construct() {
        this.builder.builderFrame();
        this.builder.builderSeat();
        return this.builder.createBike();
    }


    public Builder getBuilder() {
        return builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }
}
