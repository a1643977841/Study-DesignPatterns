package com.itheima.pattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  具体的容器类
 * </p>
 *
 * @author Liu hao
 * @version 1.0
 * @date 2022/4/5 22:37
 */
public class StudentAggregateImpl implements Aggregate<Student> {

    private final List<Student> list = new ArrayList<>();
    @Override
    public void add(Student student) {
        list.add(student);
    }

    @Override
    public void remove(Student student) {
        list.remove(student);
    }

    @Override
    public Iterator<Student> getIterator() {
        return new StudentIteratorImpl(this.list);
    }
}
