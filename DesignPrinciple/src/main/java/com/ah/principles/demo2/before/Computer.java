package com.ah.principles.demo2.before;

/**
 * 主机
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2116:52
 */
public class Computer {

    private XiJieHardDisk xiJieHardDisk;

    private IntelCpu intelCpu;

    private KingstonMemory kingstonMemory;

    /**
     * 运行计算机
     */
    public void run() {
        System.out.println("运行计算机");
        String data = xiJieHardDisk.get();
        System.out.println("硬盘上获取的数据是" + data);
        intelCpu.run();
        kingstonMemory.save();
        xiJieHardDisk.save("data");
    }

    public XiJieHardDisk getXiJieHardDisk() {
        return xiJieHardDisk;
    }

    public void setXiJieHardDisk(XiJieHardDisk xiJieHardDisk) {
        this.xiJieHardDisk = xiJieHardDisk;
    }

    public IntelCpu getIntelCpu() {
        return intelCpu;
    }

    public void setIntelCpu(IntelCpu intelCpu) {
        this.intelCpu = intelCpu;
    }

    public KingstonMemory getKingstonMemory() {
        return kingstonMemory;
    }

    public void setKingstonMemory(KingstonMemory kingstonMemory) {
        this.kingstonMemory = kingstonMemory;
    }
}
