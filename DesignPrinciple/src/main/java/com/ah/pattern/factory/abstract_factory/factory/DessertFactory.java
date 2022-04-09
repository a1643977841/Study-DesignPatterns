package com.ah.pattern.factory.abstract_factory.factory;

import com.ah.pattern.factory.abstract_factory.coffee.Coffee;
import com.ah.pattern.factory.abstract_factory.dessert.Dessert;

/**
 * 抽象工厂
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2223:44
 */
public interface DessertFactory {
    /**
     * 创建咖啡
     * @return
     */
    Coffee createCoffee();

    /**
     * 创建甜品
     * @return
     */
    Dessert createDessert();
}
