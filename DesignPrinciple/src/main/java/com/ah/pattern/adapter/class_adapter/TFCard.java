package com.ah.pattern.adapter.class_adapter;

/**
 * 适配者类接口
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2410:01
 */
public interface TFCard {
    /**
     * 读数据
     * @return 数据
     */
    String readTF();

    /**
     * 写数据
     * @param data 数据
     */
    void writeTF(String data);
}
