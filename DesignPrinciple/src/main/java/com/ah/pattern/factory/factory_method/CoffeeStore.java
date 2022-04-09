package com.ah.pattern.factory.factory_method;

import com.ah.pattern.factory.abstract_factory.coffee.Coffee;

/**
 * 咖啡店
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2222:57
 */
public class CoffeeStore {

    private CoffeeFactory factory;

    public CoffeeFactory getFactory() {
        return factory;
    }

    public void setFactory(CoffeeFactory factory) {
        this.factory = factory;
    }

    /**
     * 获取coffee
     * @return nick
     */
    public Coffee orderCoffees() {
        Coffee coffee = factory.createCoffee();
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
