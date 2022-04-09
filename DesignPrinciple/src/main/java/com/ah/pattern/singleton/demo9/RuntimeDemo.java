package com.ah.pattern.singleton.demo9;


import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/**
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2222:27
 */
public class RuntimeDemo {

    public static void main(String[] args) throws Exception {
        Runtime runtime = Runtime.getRuntime();
        // 执行控制台命令
        Process process = runtime.exec("ifconfig");
        InputStream inputStream = process.getInputStream();
        byte[] arr = new byte[1024 * 1024 * 100];
        int len = inputStream.read(arr);
        String string1 = new String(arr, 0, len, StandardCharsets.UTF_8);
        System.out.println(string1);

    }
}
