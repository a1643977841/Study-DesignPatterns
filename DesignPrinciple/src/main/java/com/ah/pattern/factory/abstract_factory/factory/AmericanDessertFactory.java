package com.ah.pattern.factory.abstract_factory.factory;

import com.ah.pattern.factory.abstract_factory.coffee.AmericanCoffee;
import com.ah.pattern.factory.abstract_factory.coffee.Coffee;
import com.ah.pattern.factory.abstract_factory.dessert.Dessert;
import com.ah.pattern.factory.abstract_factory.dessert.MatchaMousse;

/**
 * 美式甜品工厂
 * 生产美式咖啡和抹茶慕斯
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2223:47
 */
public class AmericanDessertFactory implements DessertFactory {
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new MatchaMousse();
    }
}
