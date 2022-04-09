package com.ah.pattern.singleton.demo7;

import java.io.*;

/**
 * 序列化和反序列化破坏单例模式
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2221:30
 */
public class Test {

    public static void main(String[] args) throws Exception {
        //writeObjectFromFile();
        readObjectFromFile();
        readObjectFromFile();
        readObjectFromFile();
        readObjectFromFile();
        readObjectFromFile();
        readObjectFromFile();
    }


    public static void writeObjectFromFile() throws Exception {
        // 获取对象
        Singleton instance = Singleton.getInstance();
        // 创建输出流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/Users/ahao/a.txt"));
        // 写对象
        oos.writeObject(instance);
        // 释放资源
        oos.close();
    }

    public static void readObjectFromFile() throws Exception {
        // 创建输入流
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/Users/ahao/a.txt"));
        Singleton instance = (Singleton)ois.readObject();
        System.out.println(instance);
    }
}
