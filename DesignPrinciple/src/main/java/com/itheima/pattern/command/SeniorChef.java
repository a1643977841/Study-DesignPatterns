package com.itheima.pattern.command;

/**
 * <p>
 *  厨师类
 * </p>
 *
 * @author LiuHao
 * @version V1.0
 * @date 2022/4/416:20
 */
public class SeniorChef {
    /**
     * 制造食物方法
     * @param num 数量
     * @param foodName 食物名称
     */
    public void makeFood(int num,String foodName) {
        System.out.println(num + "份" + foodName);
    }
}
