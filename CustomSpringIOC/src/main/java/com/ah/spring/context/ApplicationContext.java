package com.ah.spring.context;

import com.ah.spring.beans.factory.BeanFactory;

/**
 * <p>
 *  该接口的所以的子实现类对bean对象的创建都是非延时的，
 *  所以在该接口中定义 `refresh()` 方法，
 *  该方法主要完成以下两个功能：
 *      加载配置文件;
 *      根据注册表中的BeanDefinition对象封装的数据进行bean对象的创建;
 * </p>
 *
 * @author Liu hao
 * @version 1.0
 * @date 2022/4/9 20:48
 */
public interface ApplicationContext extends BeanFactory {
    /**
     * 进行配置文件加载并进行对象创建
     * @throws IllegalStateException nick
     * @throws Exception nick
     */
    void refresh() throws IllegalStateException, Exception;
}
