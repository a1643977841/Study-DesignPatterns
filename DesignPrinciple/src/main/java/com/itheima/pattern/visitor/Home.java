package com.itheima.pattern.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  对象结构类
 * </p>
 *
 * @author Liu hao
 * @version 1.0
 * @date 2022/4/6 17:13
 */
public class Home {
    /**
     * 存储元素角色对象
     */
    private List<Animal> nodeList = new ArrayList<>();

    /**
     * 添加方法
     * @param animal 元素角色
     */
    public void add(Animal animal) {
        nodeList.add(animal);
    }

    /**
     * 访问和访问每一个元素
     * @param person 访问者
     */
    public void action(Person person) {
        for (Animal animal : nodeList) {
            animal.accept(person);
        }
    }
}
