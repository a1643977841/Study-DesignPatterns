package com.itheima.pattern.factory.abstract_factory;

import com.itheima.pattern.factory.abstract_factory.coffee.Coffee;
import com.itheima.pattern.factory.abstract_factory.dessert.Dessert;
import com.itheima.pattern.factory.abstract_factory.factory.AmericanDessertFactory;
import com.itheima.pattern.factory.abstract_factory.factory.ItalyDessertFactory;

/**
 * 该抽象工厂方法
 * 优点：要添加同一个产品族的话 只需要增加一个工厂类即可
 * 缺点：当产品族中需要增加新的产品的时候，所有的工厂类都需要修改
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2223:51
 */
public class Test {
    public static void main(String[] args) {
        // 创建意大利甜品工厂
        ItalyDessertFactory italyDessertFactory = new ItalyDessertFactory();
        Coffee coffee = italyDessertFactory.createCoffee();
        Dessert dessert = italyDessertFactory.createDessert();
        System.out.println(coffee.getName());
        dessert.show();

        // 美式风味甜品工厂
        AmericanDessertFactory americanDessertFactory = new AmericanDessertFactory();
        Coffee coffee1 = americanDessertFactory.createCoffee();
        Dessert dessert2 = americanDessertFactory.createDessert();
        System.out.println(coffee1.getName());
        dessert2.show();

    }
}
