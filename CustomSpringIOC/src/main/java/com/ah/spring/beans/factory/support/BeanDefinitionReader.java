package com.ah.spring.beans.factory.support;

/**
 * <p>
 *      BeanDefinitionReader是用来解析配置文件并在注册表中注册bean的信息。定义了两个规范
 *      获取注册表的功能，让外界可以通过该对象获取注册表对象。
 *      加载配置文件，并注册bean数据
 * </p>
 *
 * @author Liu hao
 * @version 1.0
 * @date 2022/4/9 19:26
 */
public interface BeanDefinitionReader {
    /**
     * 获取注册表对象
     * @return 注册表对象
     */
    BeanDefinitionRegistry getRegistry();

    /**
     * 加载配置文件并在注册表中进行注册
     * @param configLocation 配置文件路径
     * @throws Exception 异常
     */
    void loadBeanDefinitions(String configLocation) throws Exception;
}
