package com.ah.spring.beans.factory;

/**
 * <p>
 *  IOC容器父接口
 * </p>
 *
 * @author Liu hao
 * @version 1.0
 * @date 2022/4/9 19:43
 */
public interface BeanFactory {
    /**
     * 根据bean对象名称获取bean对象
     * @param name bean对象名称
     * @return bean对象
     * @throws Exception 异常
     */
    Object getBean(String name) throws Exception;

    /**
     * 根据bean对象的名称获取bean对象，并进行类型转换
     * @param name  bean对象的名称
     * @param clazz nick
     * @param <T> nick
     * @return nick
     * @throws Exception nick
     */
    <T> T getBean(String name, Class<? extends T> clazz) throws Exception;
}
