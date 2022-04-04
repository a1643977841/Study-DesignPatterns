package com.itheima.principles.demo2.after;

/**
 * 硬盘接口
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2117:21
 */
public interface HardDisk {
    /**
     * 保存数据
     * @param data 数据
     */
    void save(String data);

    /**
     * 获取数据
     * @return
     */
    String get();
}
