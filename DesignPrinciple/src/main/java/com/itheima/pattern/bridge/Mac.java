package com.itheima.pattern.bridge;

/**
 * Mac----具体抽象化角色
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2411:29
 */
public class Mac extends OptionSystem{

    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        System.out.println("MAC播放");
        videoFile.decode(fileName);
    }
}
