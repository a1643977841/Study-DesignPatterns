package com.itheima.pattern.factory.simple_factory;

/**
 * 咖啡工厂类
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2222:57
 */
public class SimpleCoffeeFactory {

    /**
     * 创建coffee
     * @param type coffee类型
     * @return Coffee
     */
    public Coffee createCoffee(String type) {
        // 根据不同类型得到coffee
        Coffee coffee = null;
        switch (type) {
            case "american":{
                coffee = new AmericanCoffee();
                break;
            }
            case "latte": {
                coffee = new LatteCoffee();
                break;
            }
            default:{
                System.out.println("没有此咖啡");
            }
        }
        return coffee;
    }
}
