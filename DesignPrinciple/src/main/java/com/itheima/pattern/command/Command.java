package com.itheima.pattern.command;

/**
 * <p>
 *  抽象命令类
 * </p>
 *
 * @author LiuHao
 * @version V1.0
 * @date 2022/4/416:18
 */
public interface Command {
    /**
     * 只需要定义一个统一的执行方法即可
     */
    void execute();
}
