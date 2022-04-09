package com.ah.pattern.facade;

/**
 * <p>
 *  外观类
 *  用户主要和该类对象交互
 * </p>
 *
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/3021:48
 */
public class SmartApplicationFacade {

    private Light light;

    private Tv tv;

    private AirCondition airCondition;

    public SmartApplicationFacade() {
        this.light = new Light();
        this.tv = new Tv();
        this.airCondition = new AirCondition();
    }


    public void say(String message) {
        if(message.contains("打开")) {
            on();
        } else if(message.contains("关闭")) {
            off();
        } else {
            System.out.println("我还听不懂");
        }
    }

    private void off() {
        light.off();
        tv.off();
        airCondition.off();
    }

    private void on() {
        light.on();
        tv.on();
        airCondition.on();
    }
}
