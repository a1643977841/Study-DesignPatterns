package com.itheima.pattern.singleton.demo8;

import java.io.Serializable;

/**
 * 懒汉式-内部类
 * 测试反序列化和序列化
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2221:28
 */
public class Singleton implements Serializable {
    private static boolean flag = false;


    private Singleton() {
        synchronized (Singleton.class) {
            // 判断flag的值是否为true,如果为true  说明非第一次访问，直接抛异常
            if (flag) {
                throw new RuntimeException("不能创建多个对象");
            }
            flag = true;
        }
    }

    private static class SingletonHolder {
        private static final Singleton SINGLETON = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.SINGLETON;
    }
}
