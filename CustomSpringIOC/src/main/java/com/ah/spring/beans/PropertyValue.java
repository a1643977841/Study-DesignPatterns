package com.ah.spring.beans;

/**
 * <p>
 *  用来封装bean标签下的property的标签的属性
 *  name属性
 *  ref属性
 *  value属性 给基本数据类型String类型数据赋的值
 * </p>
 *
 * @author Liu hao
 * @version 1.0
 * @date 2022/4/9 18:05
 */
public class PropertyValue {
    /**
     * name
     */
    private String name;
    /**
     * ref
     */
    private String ref;
    /**
     * value
     */
    private String value;

    public PropertyValue() {
    }

    public PropertyValue(String name, String ref, String value) {
        this.name = name;
        this.ref = ref;
        this.value = value;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
