package com.itheima.pattern.factory.factory_method;

import com.itheima.pattern.factory.abstract_factory.coffee.Coffee;

/**
 * 抽象工厂
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2223:27
 */
public interface CoffeeFactory {

    /**
     * 创建coffee对象方法
     * @return
     */
    Coffee createCoffee();
}
