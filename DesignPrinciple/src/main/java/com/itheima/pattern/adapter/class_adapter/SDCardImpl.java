package com.itheima.pattern.adapter.class_adapter;

/**
 * 具体的sd卡类
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2410:04
 */
public class SDCardImpl implements SDCard{
    @Override
    public String readSD() {
        return "SDCard read data : sd hello";
    }

    @Override
    public void writeSD(String data) {
        System.out.println("SDCard write data : " + data);
    }
}
