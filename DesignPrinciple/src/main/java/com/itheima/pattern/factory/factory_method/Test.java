package com.itheima.pattern.factory.factory_method;

import com.itheima.pattern.factory.abstract_factory.coffee.Coffee;

/**
 * 工厂方法模式
 * 优点：
 *  1、用户只需要知道具体工厂的名称就可以得到所需要的产品，无需知道产品的具体创建过程
 *  2、在系统增加新的产品时候，只需要增加具体产品的类和对应的具体工厂类，无需对原工厂任何的修改，符合开闭原则
 * 缺点：
 *  1、每增加一个产品就需要增加一个具体的产品类和具体的工厂类，这增加了系统的复杂度
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2223:31
 */
public class Test {

    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        coffeeStore.setFactory(new AmericanCoffeeFactory());
        //coffeeStore.setFactory(new LatteCoffeeFactory());
        Coffee coffee = coffeeStore.orderCoffees();
        System.out.println(coffee.getName());
    }
}
