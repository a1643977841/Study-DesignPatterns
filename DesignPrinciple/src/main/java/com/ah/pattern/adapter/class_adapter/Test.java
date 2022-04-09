package com.ah.pattern.adapter.class_adapter;

/**
 * 类对象适配器模式
 * 类适配器模式违背了合成复用原则。类适配器是客户类有一个接口规范的情况下可用，反之不可用。
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2410:09
 */
public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer();
        String data = computer.readSD(new SDCardImpl());
        System.out.println(data);

        System.out.println("================================");
        // 使用tf 定义适配器
        String tfData = computer.readSD(new SDAdapterTf());

        System.out.println(tfData);
    }
}
