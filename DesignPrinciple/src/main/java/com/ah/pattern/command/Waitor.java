package com.ah.pattern.command;

import java.util.ArrayList;

/**
 * <p>
 *  服务生类
 * </p>
 *
 * @author LiuHao
 * @version V1.0
 * @date 2022/4/416:21
 */
public class Waitor {
    /**
     * 可以持有很多的命令对象
     */
    private ArrayList<Command> commands;

    public Waitor() {
        commands = new ArrayList();
    }

    public void setCommand(Command cmd){
        commands.add(cmd);
    }

    /**
     * 发出命令 喊 订单来了，厨师开始执行
     */
    public void orderUp() {
        System.out.println("美女服务员：叮咚，大厨，新订单来了.......");
        for (Command cmd : commands) {
            if (cmd != null) {
                cmd.execute();
            }
        }
    }
}
