package com.ah.pattern.factory.simple_factory;

import java.util.Scanner;

/**
 * 简单工厂属于经典设计模式，更像是编程习惯
 * 它不符合开闭原则
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2223:08
 */
public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String coffeeType;
        do{
            System.out.println("请输入coffee类型：");
            coffeeType = input.next();
            CoffeeStore coffeeStore = new CoffeeStore();
            Coffee coffee = coffeeStore.orderCoffees(coffeeType);
            if (coffee != null) {
                System.out.println(coffee.getName());
            }
        } while (!coffeeType.equals("exit"));
    }
}
