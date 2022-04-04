package com.itheima.pattern.factory.abstract_factory.factory;

import com.itheima.pattern.factory.abstract_factory.coffee.Coffee;
import com.itheima.pattern.factory.abstract_factory.coffee.LatteCoffee;
import com.itheima.pattern.factory.abstract_factory.dessert.Dessert;
import com.itheima.pattern.factory.abstract_factory.dessert.Tiramisu;

/**
 * 意大利风味工厂
 * 生产拿铁coffee和提拉米苏
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2223:49
 */
public class ItalyDessertFactory implements DessertFactory {
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new Tiramisu();
    }
}
