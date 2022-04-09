package com.ah.spring.beans.factory.support;

import com.ah.spring.beans.BeanDefinition;

/**
 * <p>
 *     注册表接口
 *     注册BeanDefinition对象到注册表中
 *     从注册表中删除指定名称的BeanDefinition对象
 *     根据名称从注册表中获取BeanDefinition对象
 *     判断注册表中是否包含指定名称的BeanDefinition对象
 *     获取注册表中BeanDefinition对象的个数
 *     获取注册表中所有的BeanDefinition的名称
 * </p>
 *
 * @author Liu hao
 * @version 1.0
 * @date 2022/4/9 19:16
 */
public interface BeanDefinitionRegistry {

    /**
     * 注册BeanDefinition对象到注册表中
     * @param beanName BeanDefinition对象的名称
     * @param beanDefinition BeanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

    /**
     * 从注册表中删除指定名称的BeanDefinition对象
     * @param beanName BeanDefinition对象的名称
     * @throws Exception nick
     */
    void removeBeanDefinition(String beanName) throws Exception;

    /**
     * 根据名称从注册表中获取BeanDefinition对象
     * @param beanName BeanDefinition对象的名称
     * @return BeanDefinition对象
     * @throws Exception nick
     */
    BeanDefinition getBeanDefinition(String beanName) throws Exception;

    /**
     * 判断注册表中是否包含指定名称的BeanDefinition对象
     * @param beanName BeanDefinition对象的名称
     * @return 是否存在
     */
    boolean containsBeanDefinition(String beanName);

    /**
     * 获取BeanDefinition对象数量
     * @return BeanDefinition对象数量
     */
    int getBeanDefinitionCount();

    /**
     * 获取注册表中所有的BeanDefinition的名称
     * @return BeanDefinition对象的名称
     */
    String[] getBeanDefinitionNames();
}
