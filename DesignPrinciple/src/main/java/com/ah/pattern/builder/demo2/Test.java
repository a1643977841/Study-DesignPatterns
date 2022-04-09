package com.ah.pattern.builder.demo2;

/**
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2321:00
 */
public class Test {

    public static void main(String[] args) {
        Phone phone = new Phone.Builder()
                .cpu("intel")
                .screen("三星")
                .memory("金士顿")
                .mainboard("华硕")
                .build();
        System.out.println(phone);
    }
}
