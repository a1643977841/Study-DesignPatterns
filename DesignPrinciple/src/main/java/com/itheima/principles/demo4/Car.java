package com.itheima.principles.demo4;

/**
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2120:42
 */
public class Car {
    /**
     * 颜色
     */
    private Color color;

    public void move() {
        System.out.println(color);
    }


    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
