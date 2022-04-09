package com.ah.pattern.prototype.demo;

/**
 * 具体产品类
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2311:19
 */
public class Realizetype implements Cloneable{
    public Realizetype() {
        System.out.println("构造方法调用");
    }

    @Override
    protected Realizetype clone() throws CloneNotSupportedException {
        System.out.println("原型复制了");
        return (Realizetype)super.clone();
    }
}
