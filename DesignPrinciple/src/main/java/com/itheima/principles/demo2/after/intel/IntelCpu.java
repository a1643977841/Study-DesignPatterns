package com.itheima.principles.demo2.after.intel;

import com.itheima.principles.demo2.after.Cpu;

/**
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2117:25
 */
public class IntelCpu implements Cpu {
    @Override
    public void run() {
        System.out.println("使用Intel处理器");
    }
}
