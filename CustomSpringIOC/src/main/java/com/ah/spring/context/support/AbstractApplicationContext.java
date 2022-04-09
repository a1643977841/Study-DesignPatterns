package com.ah.spring.context.support;

import com.ah.spring.beans.BeanDefinition;
import com.ah.spring.beans.factory.support.BeanDefinitionReader;
import com.ah.spring.beans.factory.support.BeanDefinitionRegistry;
import com.ah.spring.context.ApplicationContext;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 *  该类也是非延时加载<br />
 *  需要在该类中定义一个Map集合，作为bean对象存储的容器<br />
 *  声明BeanDefinitionReader类型的变量，用来进行xml配置文件的解析，符合单一职责原则。<br />
 *  BeanDefinitionReader类型的对象创建交由子类实现，
 *  因为只有子类明确到底创建BeanDefinitionReader哪儿个子实现类对象<br />。
 * </p>
 *
 * @author Liu hao
 * @version 1.0
 * @date 2022/4/9 20:52
 */
public abstract class AbstractApplicationContext implements ApplicationContext {
    /**
     * 解析器变量
     */
    protected BeanDefinitionReader beanDefinitionReader;
    /**
     * 用来存储bean对象的容器 key存储的bean的id值，value存储的bean对象
     */
    protected Map<String, Object> singletonObjects = new HashMap<String, Object>();
    /**
     * 配置文件路径
     */
    protected String configLocation;


    @Override
    public void refresh() throws IllegalStateException, Exception {
        //加载BeanDefinition
        beanDefinitionReader.loadBeanDefinitions(configLocation);

        //初始化bean
        finishBeanInitialization();
    }

    /**
     * bean的初始化
     * 注意：该类finishBeanInitialization()方法中调用getBean()方法使用到了模板方法模式。
     */
    private void finishBeanInitialization() throws Exception {
        // 获取注册表对象
        BeanDefinitionRegistry registry = beanDefinitionReader.getRegistry();
        // 获取BeanDefinition对象
        String[] beanNames = registry.getBeanDefinitionNames();
        // bean的初始化
        for (String beanName : beanNames) {
            BeanDefinition beanDefinition = registry.getBeanDefinition(beanName);
            Object bean = getBean(beanName);
        }
    }
}
