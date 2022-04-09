package com.ah.pattern.prototype.demo;

/**
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2311:21
 */
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Realizetype realizetype = new Realizetype();
        Realizetype clone = realizetype.clone();
        System.out.println(clone);
        System.out.println(realizetype);

    }
}
