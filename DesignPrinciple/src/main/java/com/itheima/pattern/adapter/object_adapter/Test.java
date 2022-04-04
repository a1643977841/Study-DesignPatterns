package com.itheima.pattern.adapter.object_adapter;


/**
 * 注意：还有一个适配器模式是接口适配器模式。当不希望实现一个接口中所有的方法时，可以创建一个抽象类Adapter ，实现所有方法。而此时我们只需要继承该抽象类即可。
 * 应用场景：
 *   1、以前开发的系统存在满足新系统功能需求的类，但其接口同新系统的接口不一致。
 *   2、使用第三方提供的组件，但组件接口定义和自己要求的接口定义不同。
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2410:21
 */
public class Test {

    public static void main(String[] args) {
        Computer computer = new Computer();
        String data = computer.readSD(new SDCardImpl());
        System.out.println(data);

        System.out.println("================================");
        // 读取TF数据
        SDAdapterTf sdAdapterTf = new SDAdapterTf(new TFCardImpl());
        String s = computer.readSD(sdAdapterTf);
        System.out.println(s);
    }
}
