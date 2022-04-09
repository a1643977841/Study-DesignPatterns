package com.ah.pattern.strategy;

/**
 * <p>
 *
 * </p>
 *
 * @author LiuHao
 * @version V1.0
 * @date 2022/4/415:53
 */
public class SalesMan {

    /**
     * 持有抽象策略角色的引用
     */
    private final Strategy strategy;

    public SalesMan(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 向客户展示促销活动
     */
    public void salesManShow(){
        strategy.show();
    }
}
