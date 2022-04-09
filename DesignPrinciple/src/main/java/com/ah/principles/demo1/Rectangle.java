package com.ah.principles.demo1;

/**
 * 长方形类
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2116:40
 */
public class Rectangle implements Quadrilateral{

    private double length;

    private double width;


    @Override
    public double getLength() {
        return length;
    }

    @Override
    public double getWidth() {
        return width;
    }


    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
