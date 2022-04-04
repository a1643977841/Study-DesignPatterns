package com.itheima.pattern.factory.simple_factory;

/**
 * 咖啡店
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2222:57
 */
public class CoffeeStore {
    /**
     * 获取coffee
     * @param type coffee类型
     * @return nick
     */
    public Coffee orderCoffees(String type) {
        SimpleCoffeeFactory factory = new SimpleCoffeeFactory();
        return factory.createCoffee(type);
    }
}
