package com.itheima.pattern.singleton.demo3;

/**
 * 懒汉式-线程安全
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2121:59
 */
public class Singleton {

    private Singleton() {

    }
    private static Singleton singleton;

    public static synchronized Singleton getInstance() {
        //  如果没有创建一个返回
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
