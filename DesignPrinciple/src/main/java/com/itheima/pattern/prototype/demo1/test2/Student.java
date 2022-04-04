package com.itheima.pattern.prototype.demo1.test2;

import java.io.Serializable;

/**
 * 学生类
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2311:30
 */
public class Student implements Serializable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
