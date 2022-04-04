package com.itheima.pattern.adapter.class_adapter;

/**
 * 适配器类
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2410:11
 */
public class SDAdapterTf extends TFCardImpl implements SDCard{

    @Override
    public String readSD() {
        System.out.println("adapter read tf card data");
        return readTF();
    }

    @Override
    public void writeSD(String data) {
        System.out.println("adapter write tf card" + data);
        writeTF(data);
    }
}
