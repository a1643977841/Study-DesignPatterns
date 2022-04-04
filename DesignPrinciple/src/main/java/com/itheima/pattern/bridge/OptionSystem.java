package com.itheima.pattern.bridge;

/**
 * 抽象操作系统---抽象化角色
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2411:27
 */
public abstract class OptionSystem {

    protected VideoFile videoFile;

    public OptionSystem(VideoFile videoFile) {
        this.videoFile = videoFile;
    }

    public abstract void play(String fileName);
}
