package com.ah.pattern.singleton.demo4;

/**
 * 懒汉式-双重检查式
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2122:05
 */
public class Singleton {

    private Singleton() {

    }

    private static volatile Singleton singleton;

    public static Singleton getInstance() {
        // 如果singleton值不为null，不需要抢占锁，直接返回
        if (singleton == null) {
            synchronized(Singleton.class) {
                // 第二次判断
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
