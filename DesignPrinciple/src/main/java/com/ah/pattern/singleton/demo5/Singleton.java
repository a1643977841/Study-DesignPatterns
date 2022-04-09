package com.ah.pattern.singleton.demo5;

/**
 * 懒汉式-静态内部类
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2122:11
 */
public class Singleton {


    private Singleton() {

    }

    private static class SingletonHolder {
        private static final Singleton SINGLETON = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.SINGLETON;
    }
}
