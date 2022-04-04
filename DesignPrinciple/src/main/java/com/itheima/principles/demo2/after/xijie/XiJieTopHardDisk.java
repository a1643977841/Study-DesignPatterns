package com.itheima.principles.demo2.after.xijie;

import com.itheima.principles.demo2.after.HardDisk;

/**
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2117:31
 */
public class XiJieTopHardDisk implements HardDisk {
    @Override
    public void save(String data) {
        System.out.println("希捷高级硬盘保存数据：" + data);
    }

    @Override
    public String get() {
        return "希捷高级硬盘获取数据！";
    }
}
