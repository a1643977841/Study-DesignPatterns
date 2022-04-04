package com.itheima.principles.demo1;

/**
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2116:41
 */
public class TestDemo {

    public static void main(String[] args) {
        // 创建长方形对象
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(20);
        rectangle.setWidth(10);
        // 扩宽操作
        resize(rectangle);
        printLengthAndWidth(rectangle);
    }


    private static void resize(Rectangle rectangle) {
        // 扩宽
        while (rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
        }
    }

    private static void printLengthAndWidth(Quadrilateral quadrilateral) {
        System.out.println("长："+quadrilateral.getLength());
        System.out.println("宽："+quadrilateral.getWidth());
    }
}
