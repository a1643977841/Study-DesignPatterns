package com.itheima.pattern.bridge;

/**
 * AVI视频文件---具体实现化角色
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2411:20
 */
public class AviFile implements VideoFile{
    @Override
    public void decode(String fileName) {
        System.out.println("AVI视频文件 : " + fileName);
    }
}
