package com.ah.pattern.bridge;

/**
 * Windows----具体抽象话角色
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2411:29
 */
public class Windows extends OptionSystem{

    public Windows(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        System.out.println("windows 播放");
        super.videoFile.decode(fileName);
    }
}
