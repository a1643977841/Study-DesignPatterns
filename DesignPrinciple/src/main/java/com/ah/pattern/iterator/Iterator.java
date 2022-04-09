package com.ah.pattern.iterator;

/**
 * <p>
 *  抽象迭代器角色接口
 * </p>
 *
 * @author Liu hao
 * @version 1.0
 * @date 2022/4/5 22:27
 */
public interface Iterator<T> {
    /**
     * 判断是否还有元素
     * @return 有无
     */
    boolean hasNext();

    /**
     * 获取下一个元素
     * @return 元素
     */
    T next();
}
