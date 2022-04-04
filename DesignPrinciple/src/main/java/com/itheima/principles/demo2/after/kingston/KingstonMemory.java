package com.itheima.principles.demo2.after.kingston;

import com.itheima.principles.demo2.after.Memory;

/**
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2117:25
 */
public class KingstonMemory implements Memory {
    @Override
    public void save(String data) {
        System.out.println("使用金士顿类存条" + data);
    }
}
