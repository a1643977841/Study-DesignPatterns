package com.itheima.pattern.adapter.object_adapter;

/**
 * 适配器类
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2410:11
 */
public class SDAdapterTf implements SDCard {

    private TFCard tfCard;


    public SDAdapterTf(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public String readSD() {
        System.out.println("adapter read tf card data");
        return tfCard.readTF();
    }

    @Override
    public void writeSD(String data) {
        System.out.println("adapter write tf card" + data);
        tfCard.writeTF(data);
    }
}
