package com.ah.principles.demo3;

/**
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2120:15
 */
public class ITcasSafetyDoor implements AntiTheft, Fireproof {
    @Override
    public void antiTheft() {
        System.out.println("防盗");
    }

    @Override
    public void fireproof() {
        System.out.println("防火");
    }
}
