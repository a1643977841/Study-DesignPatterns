package com.itheima.pattern.proxy.cglib_proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2322:38
 */
public class ProxyFactory implements MethodInterceptor {

    private Object object = null;

    public Object getProxyObject(Class<?> superclass,Object object) {
        this.object = object;
        // 创建Enhancer对象，它类似JDK代理的Proxy类
        Enhancer enhancer = new Enhancer();
        // 设置父类class或者说指定父类
        enhancer.setSuperclass(superclass);
        // 设置回调函数  需要的是MethodInterceptor接口的子实现类
        enhancer.setCallback(this);
        // 创建代理对象 并且返回
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("方法执行了");
        Object invoke = method.invoke(object, objects);
        return invoke;
    }
}
