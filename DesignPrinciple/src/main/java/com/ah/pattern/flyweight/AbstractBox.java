package com.ah.pattern.flyweight;

/**
 * <p>
 *  抽象享元角色
 * </p>
 *
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/3120:43
 */
public abstract class AbstractBox {
    /**
     * 获取图形方法
     * @return 图形
     */
    public abstract String getShape();

    /**
     * 显示方法
     * @param color 颜色
     */
    public void display(String color) {
        System.out.println("方块形状：" + this.getShape() + " 颜色：" + color);
    }
}
