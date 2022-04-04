package com.itheima.pattern.singleton.demo2;

/**
 * 饿汉式-静态代码块
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2121:06
 */
public class Singleton {

    private Singleton() {}

    private static final Singleton SINGLETON;

    static {
        SINGLETON = new Singleton();
    }

    public static Singleton getInstance() {
        return SINGLETON;
    }
}
