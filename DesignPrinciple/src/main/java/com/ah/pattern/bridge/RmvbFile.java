package com.ah.pattern.bridge;

/**
 * Rmvn视频文件----具体实现化角色
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2411:21
 */
public class RmvbFile implements VideoFile{
    @Override
    public void decode(String fileName) {
        System.out.println("Rmvb视频文件 : " + fileName);
    }
}
