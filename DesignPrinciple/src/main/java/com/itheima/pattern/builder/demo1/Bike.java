package com.itheima.pattern.builder.demo1;

/**
 * 产品对象
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2314:24
 */
public class Bike {

    /**
     * 车架
     */
    private String frame;
    /**
     * 车座
     */
    private String seat;


    public String getName() {
        return frame;
    }

    public void setName(String name) {
        this.frame = name;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }
}
