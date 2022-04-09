package com.ah.pattern.factory.factory_method;

import com.ah.pattern.factory.abstract_factory.coffee.Coffee;
import com.ah.pattern.factory.abstract_factory.coffee.LatteCoffee;

/**
 * 拿铁咖啡工厂类
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2223:29
 */
public class LatteCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
