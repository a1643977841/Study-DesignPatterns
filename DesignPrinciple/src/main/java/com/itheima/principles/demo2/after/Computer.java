package com.itheima.principles.demo2.after;

/**
 * 计算机
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2117:27
 */
public class Computer {

    private Cpu cpu;

    private HardDisk hardDisk;

    private Memory memory;

    /**
     * 计算机运行方法
     */
    public void run() {
        System.out.println("运行计算机");
        String data = hardDisk.get();
        System.out.println("硬盘上获取的数据是" + data);
        cpu.run();
        memory.save("数据");
        hardDisk.save("data");
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }
}
