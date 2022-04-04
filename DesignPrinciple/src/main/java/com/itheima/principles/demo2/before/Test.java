package com.itheima.principles.demo2.before;

/**
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2116:54
 */
public class Test {

    public static void main(String[] args) {
        // 创建计算机对象
        Computer c = new Computer();
        // 创建组建对象
        XiJieHardDisk xiJieHardDisk = new XiJieHardDisk();
        IntelCpu cpu = new IntelCpu();
        KingstonMemory kingstonMemory = new KingstonMemory();
        c.setXiJieHardDisk(xiJieHardDisk);
        c.setIntelCpu(cpu);
        c.setKingstonMemory(kingstonMemory);
        c.run();
    }


}
