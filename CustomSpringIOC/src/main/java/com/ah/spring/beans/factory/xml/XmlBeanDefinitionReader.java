package com.ah.spring.beans.factory.xml;

import com.ah.spring.beans.BeanDefinition;
import com.ah.spring.beans.MutablePropertyValues;
import com.ah.spring.beans.PropertyValue;
import com.ah.spring.beans.factory.support.BeanDefinitionReader;
import com.ah.spring.beans.factory.support.BeanDefinitionRegistry;
import com.ah.spring.beans.factory.support.SimpleBeanDefinitionRegistry;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
import java.util.List;

/**
 * <p>
 *  XmlBeanDefinitionReader类是专门用来解析xml配置文件的。该类实现BeanDefinitionReader接口并实现接口中的两个功能。
 * </p>
 *
 * @author Liu hao
 * @version 1.0
 * @date 2022/4/9 19:27
 */
public class XmlBeanDefinitionReader implements BeanDefinitionReader {
    /**
     * 注册表对象
     */
    private BeanDefinitionRegistry registry;

    public XmlBeanDefinitionReader() {
        this.registry = new SimpleBeanDefinitionRegistry();
    }

    @Override
    public BeanDefinitionRegistry getRegistry() {
        return registry;
    }

    @Override
    public void loadBeanDefinitions(String configLocation) throws Exception {
        // 使用dom4j解析xml文件
        SAXReader reader = new SAXReader();
        // 获取类路径下的配置文件
        InputStream is = this.getClass().getClassLoader().getResourceAsStream(configLocation);
        Document document = reader.read(is);
        // 根据Document对象获取跟标签对象
        Element rootElement = document.getRootElement();
        // 解析bean标签
        parseBean(rootElement);
    }

    private void parseBean(Element rootElement) {
        List<Element> elements = rootElement.elements();
        for (Element element : elements) {
            // 获取id属性
            String id = element.attributeValue("id");
            // 获取class属性
            String className = element.attributeValue("class");
            // 将属性存入beanDefinition对象中
            BeanDefinition beanDefinition = new BeanDefinition();
            beanDefinition.setId(id);
            beanDefinition.setClassName(className);
            // 获取bean标签下所有的property标签
            List<Element> list = element.elements("property");
            MutablePropertyValues mutablePropertyValues = new MutablePropertyValues();
            for (Element propertyElement : list) {
                // 获取属性
                String name = propertyElement.attributeValue("name");
                String ref = propertyElement.attributeValue("ref");
                String value = propertyElement.attributeValue("value");
                // 将属性存入PropertyValue对象中
                PropertyValue propertyValue = new PropertyValue(name, ref, value);
                // 将PropertyValue对象存入MutablePropertyValues对象中
                mutablePropertyValues.addPropertyValue(propertyValue);
            }
            beanDefinition.setPropertyValues(mutablePropertyValues);
            // 存入注册表中
            registry.registerBeanDefinition(id, beanDefinition);
        }
    }
}
