package com.ah.pattern.factory.config_factory;

/**
 *
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2300:18
 */
public class Test {

    public static void main(String[] args) {
        Coffee name = CoffeeFactory.createCoffee("american");
        System.out.println(name);
    }
}