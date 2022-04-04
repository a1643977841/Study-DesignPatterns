package com.itheima.pattern.adapter.object_adapter;

/**
 * 电脑
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2410:06
 */
public class Computer {


    public String readSD(SDCard sdCard) {
        if(sdCard == null) {
            throw new NullPointerException("sd card is null");
        }
        return sdCard.readSD();
    }

    public void writeSD(SDCard sdCard, String data) {
        if(sdCard == null) {
            throw new NullPointerException("sd card is null");
        }
        sdCard.writeSD(data);
    }

}
