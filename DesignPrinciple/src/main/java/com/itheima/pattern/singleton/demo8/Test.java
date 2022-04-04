package com.itheima.pattern.singleton.demo8;

import java.lang.reflect.Constructor;

/**
 * 反射破坏单例
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2221:39
 */
public class Test {

    public static void main(String[] args) throws Exception {
        Class<Singleton> singletonClass = Singleton.class;
        Constructor<Singleton> declaredConstructor = singletonClass.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        Singleton singleton = declaredConstructor.newInstance();
        System.out.println(singleton);
        Singleton singleton1 = declaredConstructor.newInstance();
        System.out.println(singleton1);
    }
}
