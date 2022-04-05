package com.itheima.pattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  具体的迭代器类
 * </p>
 *
 * @author Liu hao
 * @version 1.0
 * @date 2022/4/5 22:29
 */
public class StudentIteratorImpl implements Iterator<Student> {
    /**
     * 存放数据
     */
    private List<Student> list;
    /**
     * 用来记录遍历时的位置
     */
    private int position = 0;

    public StudentIteratorImpl(List<Student> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return position < list.size();
    }

    @Override
    public Student next() {
        Student student = list.get(position);
        position++;
        return student;
    }
}
