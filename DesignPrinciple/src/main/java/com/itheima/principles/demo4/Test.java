package com.itheima.principles.demo4;

/**
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2120:47
 */
public class Test {

    public static void main(String[] args) {
        Car car = new BlueCar();
        Color color = new Red();
        car.setColor(color);
        car.move();
    }
}
