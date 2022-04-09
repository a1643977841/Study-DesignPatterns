package com.ah.principles.demo2.after.xijie;

import com.ah.principles.demo2.after.HardDisk;

/**
 * 希捷硬盘
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2117:23
 */
public class XiJieHardDisk implements HardDisk {
    /**
     * 保存希捷数据
     * @param data 数据
     */
    @Override
    public void save(String data) {
        System.out.println("使用希捷硬盘存储数据为：" + data);
    }

    /**
     * 获取希捷数据
     * @return nick
     */
    @Override
    public String get() {
        System.out.println("使用希捷硬盘获取");
        return "数据";
    }
}
