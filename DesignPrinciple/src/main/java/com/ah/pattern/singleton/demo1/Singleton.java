package com.ah.pattern.singleton.demo1;

/**
 * 饿汉式-静态成员变量方式
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2120:59
 */
public class Singleton {

    private Singleton() {}

    private static final Singleton INSTANCE = new Singleton();

    public static Singleton getInstance() {
        return INSTANCE;
    }
}
