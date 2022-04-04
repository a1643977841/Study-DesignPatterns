package com.itheima.pattern.proxy.jdk_proxy;

/**
 * JDK-动态代理
 * 必须实现接口，
 * JDK代理是对接口的代理
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2321:38
 */
public class Test {
    public static void main(String[] args) {
        // 创建代理工厂对象
        ProxyFactory proxyFactory = new ProxyFactory();
        SellTickets proxyObject = proxyFactory.getProxyObject();
        proxyObject.sell();
        System.out.println(proxyObject.getClass());
        while(true) {}
    }
}
