package com.ah.pattern.singleton.demo7;

import java.io.Serializable;

/**
 * 懒汉式-内部类
 * 测试反序列化和序列化
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2221:28
 */
public class Singleton implements Serializable {
    private Singleton() {

    }

    private static class SingletonHolder {
        private static final Singleton SINGLETON = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.SINGLETON;
    }

    /**
     * 该方法是防止序列化反序列化破坏单例模式，
     * 该方法在反序列化的时候会自动调用
     * @return nick
     */
    public Object readResolve() {
        return SingletonHolder.SINGLETON;
    }
}
