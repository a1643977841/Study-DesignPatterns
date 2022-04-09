package com.ah.principles.demo1;

/**
 * 正方形
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2116:39
 */
public class Square implements Quadrilateral{


    private double side;


    @Override
    public double getLength() {
        return side;
    }

    @Override
    public double getWidth() {
        return side;
    }


    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
