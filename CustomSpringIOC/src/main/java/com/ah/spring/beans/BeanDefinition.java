package com.ah.spring.beans;

/**
 * <p>
 *  BeanDefinition类用来封装bean信息
 *  主要包含id（即bean对象的名称）、class（需要交由spring管理的类的全类名）及子标签property数据。
 * </p>
 *
 * @author Liu hao
 * @version 1.0
 * @date 2022/4/9 19:03
 */
public class BeanDefinition {
    private String id;

    private String className;

    private MutablePropertyValues propertyValues;

    public BeanDefinition() {
        propertyValues = new MutablePropertyValues();
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public MutablePropertyValues getPropertyValues() {
        return propertyValues;
    }

    public void setPropertyValues(MutablePropertyValues propertyValues) {
        this.propertyValues = propertyValues;
    }
}
