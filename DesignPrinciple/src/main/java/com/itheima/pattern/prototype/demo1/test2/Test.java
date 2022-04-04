package com.itheima.pattern.prototype.demo1.test2;

import java.io.*;

/**
 * 浅克隆：创建一个新对象，新对象的属性和原来的对象完全相同，对于非基本类型属性，仍指向原来的属性所指向的地址
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2311:25
 */
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        Citation citation = new Citation();
        Student student = new Student();
        student.setName("张三");
        citation.setStudent(student);

        // 创建对象输出流
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("/Users/ahao/a.txt"));
        objectOutputStream.writeObject(citation);
        objectOutputStream.close();
        // 创建输入流对象
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("/Users/ahao/a.txt"));
        Citation citation1 = (Citation)objectInputStream.readObject();
        objectInputStream.close();
        citation1.getStudent().setName("李四");
        citation.show1();
        citation1.show1();
    }
}
