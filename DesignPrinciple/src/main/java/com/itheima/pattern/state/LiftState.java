package com.itheima.pattern.state;

/**
 * <p>
 *  抽象状态类
 * </p>
 *
 * @author LiuHao
 * @version V1.0
 * @date 2022/4/500:05
 */
public abstract class LiftState {
    /**
     * 定义一个环境角色，也就是封装状态的变化引起的功能变化
     */
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    /**
     * 电梯开门动作
     */
    public abstract void open();

    /**
     * 电梯关门动作
     */
    public abstract void close();

    /**
     * 电梯运作动作
     */
    public abstract void run();

    /**
     * 电梯停止动作
     */
    public abstract void stop();
}
