package com.itheima.pattern.proxy.static_proxy;

/**
 * 代售点
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2321:23
 */
public class ProxyPoint implements SellTickets{

    private TrainStation trainStation = new TrainStation();
    @Override
    public void sell() {
        System.out.println("代理人买票,收取服务费");
        trainStation.sell();
    }
}
