package com.itheima.principles.demo2.before;

/**
 * 希捷硬盘
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2116:48
 */
public class XiJieHardDisk {
    /**
     * 保存希捷数据
     * @param data 数据
     */
    public void save(String data) {
        System.out.println("使用希捷硬盘存储数据为：" + data);
    }

    /**
     * 获取希捷数据
     * @return nick
     */
    public String get() {
        System.out.println("使用希捷硬盘获取");
        return "数据";
    }

}
