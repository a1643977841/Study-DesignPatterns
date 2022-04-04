package com.itheima.pattern.singleton.demo6;

/**
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2122:16
 */
public class Test {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance1 = Singleton.INSTANCE;
        System.out.println(instance);
        System.out.println(instance1);
    }
}
