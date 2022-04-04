package com.itheima.principles.demo3;

/**
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2120:12
 */
public class Test {

    public static void main(String[] args) {
        // 创建安全门对象
        HeiMaSafetyDoor door = new HeiMaSafetyDoor();
        door.antiTheft();
        door.fireproof();
        door.waterproof();
        System.out.println("=============================================");
        ITcasSafetyDoor door1 = new ITcasSafetyDoor();
        door1.antiTheft();
        door1.fireproof();
    }
}
