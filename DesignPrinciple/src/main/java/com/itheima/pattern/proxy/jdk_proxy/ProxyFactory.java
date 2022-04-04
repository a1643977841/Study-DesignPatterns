package com.itheima.pattern.proxy.jdk_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * 获取代理对象的工厂类
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2321:29
 */
public class ProxyFactory {
    private final TrainStation trainStation = new TrainStation();

    /**
     * 获取代理对象的方法
     * @return nick
     */
    public SellTickets getProxyObject() {
        // 返回代理对象即可
        /*
            ClassLoader loader,:类加载器，用于加载代理类，可以通过目标对象获取类加载器
            Class<?>[] interfaces,:代理类实现的接口字节码对象
            InvocationHandler h : 代理对象的调用程序
         */
        Class<? extends TrainStation> trainStationClass = trainStation.getClass();
        return (SellTickets)Proxy.newProxyInstance(
                trainStationClass.getClassLoader(),
                trainStationClass.getInterfaces(),
                new InvocationHandler() {
                    /**
                     *
                     * @param proxy 和 proxyObject是同一个对象 本方法基本不用
                     * @param method 对接口中的方法进行封装的method
                     * @param args 调用方法的实际参数
                     * @return 方法的返回值
                     * @throws Throwable
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("代售点收取一定的服务费用(JDK动态代理)");
                        // 执行目标对象的方法
                        Object invoke = method.invoke(trainStation, args);

                        return invoke;
                    }
                });
    }
}
