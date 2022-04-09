package com.ah.spring.beans;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * <p>
 *  用来存储并管理多个PropertyValue对象。
 * </p>
 *
 * @author Liu hao
 * @version 1.0
 * @date 2022/4/9 18:46
 */
public class MutablePropertyValues implements Iterable<PropertyValue> {

    private final List<PropertyValue> propertyValueList;

    public MutablePropertyValues() {
        this.propertyValueList = new ArrayList<>();
    }

    public MutablePropertyValues(List<PropertyValue> propertyValueList) {
        this.propertyValueList = (propertyValueList != null ? propertyValueList : new ArrayList<>());
    }

    /**
     * 获取所有的PropertyValue对象
     * @return 所有的PropertyValue对象
     */
    public PropertyValue[] getPropertyValues() {
        return this.propertyValueList.toArray(new PropertyValue[0]);
    }

    /**
     * 根据名称获取PropertyValue对象
     * @param propertyName 属性名称
     * @return PropertyValue对象
     */
    public PropertyValue getPropertyValue(String propertyName) {
        for (PropertyValue pv : this.propertyValueList) {
            if (pv.getName().equals(propertyName)) {
                return pv;
            }
        }
        return null;
    }

    @Override
    public Iterator<PropertyValue> iterator() {
        return this.propertyValueList.iterator();
    }

    /**
     * 判断集合是否为空
     * @return true:集合为空，false:集合不为空
     */
    public boolean isEmpty() {
        return this.propertyValueList.isEmpty();
    }

    /**
     * 添加PropertyValue对象
     * @param pv PropertyValue对象
     * @return this 目的是为了链式调用
     */
    public MutablePropertyValues addPropertyValue(PropertyValue pv) {
        // 判断是否已经存在，存在则覆盖，不存在则添加
        for (int i = 0; i < this.propertyValueList.size(); i++) {
            PropertyValue currentPv = this.propertyValueList.get(i);
            if (currentPv.getName().equals(pv.getName())) {
                this.propertyValueList.set(i, new PropertyValue(pv.getName(), pv.getRef(), pv.getValue()));
                return this;
            }
        }
        this.propertyValueList.add(pv);
        return this;
    }

    /**
     * 判断是否有指定名称的PropertyValue对象
     * @param propertyName 属性名称
     * @return  true:有，false:没有
     */
    public boolean contains(String propertyName) {
        return getPropertyValue(propertyName) != null;
    }
}
