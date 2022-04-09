package com.ah.pattern.proxy.jdk_proxy;

/**
 * 具体主题类
 * 火车站卖票
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2321:22
 */
public class TrainStation implements SellTickets {
    @Override
    public void sell() {
        System.out.println("火车站卖票");
    }
}
