package com.ah.pattern.proxy.cglib_proxy;

/**
 * cglib动态代理
 * jdk代理和CGLIB代理对比：
 *   1、使用CGLib实现动态代理，CGLib底层采用ASM字节码生成框架，使用字节码技术生成代理类，
 *      在JDK1.6之前比使用Java反射效率要高。唯一需要注意的是，CGLib不能对声明为final的类或者方法进行代理，因为CGLib原理是动态生成被代理类的子类。
 *   2、在JDK1.6、JDK1.7、JDK1.8逐步对JDK动态代理优化之后，在调用次数较少的情况下，JDK代理效率高于CGLib代理效率，
 *      只有当进行大量调用的时候，DK1.6和JDK1.7比CGLib代理效率低一点，
 *      但是到JDK1.8的时候，JDK代理效率高于CGLib代理。所以如果有接口使用JDK动态代理，如果没有接口使用CGLIB代理。
 *
 * 动态代理和静态代理对比：
 *   1、动态代理与静态代理相比较，最大的好处是接口中声明的所有方法都被转移到调用处理器一个集中的方法中处理（InvocationHandler.invoke）。
 *      这样，在接口方法数量比较多的时候，我们可以进行灵活处理，而不需要像静态代理那样每一个方法进行中转。
 *   2、如果接口增加一个方法，静态代理模式除了所有实现类需要实现这个方法外，所有代理类也需要实现此方法。增加了代码维护的复杂度。而动态代理不会出现该问题
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2322:44
 */
public class Test {

    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        TrainStation proxyObject = (TrainStation) proxyFactory.getProxyObject(TrainStation.class,new TrainStation());
        proxyObject.sell();
        System.out.println(proxyObject.getClass());
        while(true) {

        }
    }
}
