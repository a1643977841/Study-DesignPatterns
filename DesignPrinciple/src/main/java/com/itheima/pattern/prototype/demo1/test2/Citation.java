package com.itheima.pattern.prototype.demo1.test2;

import java.io.Serializable;

/**
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2311:23
 */
public class Citation implements Cloneable, Serializable {
    private String name;
    private Student student;
    @Override
    protected Citation clone() throws CloneNotSupportedException {
        return (Citation)super.clone();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println(name+"学生表现优秀，特发此奖状");
    }
    public void show1() {
        System.out.println(student.getName()+"学生表现优秀，特发此奖状");
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
