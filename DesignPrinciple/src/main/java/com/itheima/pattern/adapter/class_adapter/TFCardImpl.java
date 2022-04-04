package com.itheima.pattern.adapter.class_adapter;

/**
 * 具体的tf卡类
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2410:02
 */
public class TFCardImpl implements TFCard{
    @Override
    public String readTF() {
        return "TFCard read data : tf hello";
    }

    @Override
    public void writeTF(String data) {
        System.out.println("TFCard write data : " + data);
    }
}
