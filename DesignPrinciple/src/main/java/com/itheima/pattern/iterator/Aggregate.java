package com.itheima.pattern.iterator;

/**
 * <p>
 *  抽象容器类，包含添加元素，删除元素，获取迭代器对象方法
 * </p>
 *
 * @author Liu hao
 * @version 1.0
 * @date 2022/4/5 22:35
 */
public interface Aggregate<T> {
    /**
     * 添加一个元素
     * @param t 元素
     */
    void add(T t);

    /**
     * 删除一个元素
     * @param t
     */
    void remove(T t);

    /**
     * 获取一个迭代器
     * @return nick
     */
    Iterator<T> getIterator();
}
