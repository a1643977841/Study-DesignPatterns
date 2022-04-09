package com.ah.pattern.factory.factory_method;

import com.ah.pattern.factory.abstract_factory.coffee.AmericanCoffee;
import com.ah.pattern.factory.abstract_factory.coffee.Coffee;

/**
 * 没事coffee工厂类
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2223:29
 */
public class AmericanCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {

        return new AmericanCoffee();
    }
}
