package com.ah.pattern.adapter.object_adapter;

/**
 * 目标接口
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2410:03
 */
public interface SDCard {

    /**
     * 读数据
     * @return 数据
     */
    String readSD();

    /**
     * 写数据
     * @param data 数据
     */
    void writeSD(String data);
}
