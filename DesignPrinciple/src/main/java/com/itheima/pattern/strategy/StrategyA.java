package com.itheima.pattern.strategy;

/**
 * <p>
 *  具体策略角色
 *  为春节准备的促销活动A
 * </p>
 *
 * @author LiuHao
 * @version V1.0
 * @date 2022/4/415:31
 */
public class StrategyA implements Strategy {
    @Override
    public void show() {
        System.out.println("买一送一");
    }
}
