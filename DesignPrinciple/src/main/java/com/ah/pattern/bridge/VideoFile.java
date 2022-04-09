package com.ah.pattern.bridge;

/**
 * 抽象实现化类
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2411:18
 */
public interface VideoFile {
    /**
     * 解码视频
     * @param fileName 视频名称
     */
    void decode(String fileName);
}
