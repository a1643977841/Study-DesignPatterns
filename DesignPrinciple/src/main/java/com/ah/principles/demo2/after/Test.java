package com.ah.principles.demo2.after;

import com.ah.principles.demo2.after.intel.IntelCpu;
import com.ah.principles.demo2.after.kingston.KingstonMemory;
import com.ah.principles.demo2.after.xijie.XiJieHardDisk;

/**
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2117:29
 */
public class Test {

    public static void main(String[] args) {
        Computer c = new Computer();

        IntelCpu intelCpu = new IntelCpu();
        KingstonMemory kingstonMemory = new KingstonMemory();
        XiJieHardDisk xiJieHardDisk = new XiJieHardDisk();
        // 使用高级版希捷硬盘
        //XiJieTopHardDisk xiJieTopHardDisk = new XiJieTopHardDisk();
        c.setCpu(intelCpu);
        c.setHardDisk(xiJieHardDisk);
        c.setMemory(kingstonMemory);
        c.run();
    }
}
