package com.ah.spring.context.support;

import com.ah.spring.beans.BeanDefinition;
import com.ah.spring.beans.MutablePropertyValues;
import com.ah.spring.beans.PropertyValue;
import com.ah.spring.beans.factory.support.BeanDefinitionRegistry;
import com.ah.spring.beans.factory.xml.XmlBeanDefinitionReader;
import com.ah.spring.utils.StringUtils;

import java.lang.reflect.Method;

/**
 * <p>
 *  IOC容器的子实现类
 *  用于加载类路径下的xml格式的配置文件，并进行bean对象的创建
 *      在构造方法中，创建BeanDefinitionReader对象。
 *      在构造方法中，调用refresh()方法，用于进行配置文件加载、创建bean对象并存储到容器中。
 *      重写父接口中的getBean()方法，并实现依赖注入操作。
 * </p>
 *
 * @author Liu hao
 * @version 1.0
 * @date 2022/4/9 21:01
 */
public class ClassPathXmlApplicationContext extends AbstractApplicationContext {

    public ClassPathXmlApplicationContext(String configLocation) {
        this.configLocation = configLocation;
        //构建XmlBeanDefinitionReader对象
        this.beanDefinitionReader = new XmlBeanDefinitionReader();
        try {
            this.refresh();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 根据Bean名称获取Bean对象
     * @param name bean对象名称
     * @return Bean对象
     * @throws Exception nick
     */
    @Override
    public Object getBean(String name) throws Exception {
        Object obj = this.singletonObjects.get(name);
        // 存在就返回
        if (obj != null) {
            return obj;
        }
        // 不存在就创建，获取BeanDefinition对象
        BeanDefinitionRegistry registry = this.beanDefinitionReader.getRegistry();
        BeanDefinition beanDefinition = registry.getBeanDefinition(name);
        if (beanDefinition == null)
            return null;
        // 获取className
        String className = beanDefinition.getClassName();
        // 通过反射创建对象
        Class<?> clazz = Class.forName(className);
        Object beanObj = clazz.newInstance();
        //  进行依赖注入
        MutablePropertyValues propertyValues = beanDefinition.getPropertyValues();
        for (PropertyValue propertyValue : propertyValues) {
            // 获取相关属性
            String propertyName = propertyValue.getName();
            String value = propertyValue.getValue();
            String ref = propertyValue.getRef();
            if(ref != null && !"".equals(ref)) {
                // 获取依赖的Bean对象(递归调用)
                Object bean = getBean(ref);
                String methodName = StringUtils.getSetterMethodNameByFieldName(propertyName);
                // 获取所有方法对象
                Method[] methods = clazz.getMethods();
                for (Method method : methods) {
                    if(method.getName().equals(methodName)) {
                        // 执行该方法
                        method.invoke(beanObj,bean);
                    }
                }
            }
            if(value != null && !"".equals(value)) {
                // 拼接方法名
                String methodName = StringUtils.getSetterMethodNameByFieldName(propertyName);
                if (methodName != null) {
                    Method method = clazz.getMethod(methodName, String.class);
                    method.invoke(beanObj,value);
                }
            }
        }
        // 将该对象存储到map容器中
        this.singletonObjects.put(name, beanObj);
        return beanObj;
    }

    @Override
    public <T> T getBean(String name, Class<? extends T> clazz) throws Exception {
        Object bean = getBean(name);
        if(bean != null) {
            return clazz.cast(bean);
        }
        return null;
    }
}
