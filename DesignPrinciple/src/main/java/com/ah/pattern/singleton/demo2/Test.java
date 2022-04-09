package com.ah.pattern.singleton.demo2;

/**
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2121:08
 */
public class Test {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance);
        System.out.println(instance1);

    }
}
