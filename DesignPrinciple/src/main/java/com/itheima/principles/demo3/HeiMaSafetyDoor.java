package com.itheima.principles.demo3;

/**
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2120:11
 */
public class HeiMaSafetyDoor implements AntiTheft, Fireproof, Waterproof{
    @Override
    public void antiTheft() {
        System.out.println("防盗");
    }

    @Override
    public void fireproof() {
        System.out.println("防火");
    }

    @Override
    public void waterproof() {
        System.out.println("防水");
    }
}
