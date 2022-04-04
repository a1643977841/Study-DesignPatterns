package com.itheima.pattern.state;

/**
 * <p>
 *  电梯开启状态类
 * </p>
 *
 * @author LiuHao
 * @version V1.0
 * @date 2022/4/500:09
 */
public class OpenNingState extends LiftState{
    @Override
    public void open() {
        System.out.println("电梯开启。。。。。");
    }

    @Override
    public void close() {
        // 修改状态为关闭
        super.context.setLiftState(Context.CLOSING_STATE);
        super.context.close();
        System.out.println("电梯关闭。。。。。");
    }

    @Override
    public void run() {
        System.out.println("电梯打开状态，不允许运行。。。。。");
    }

    @Override
    public void stop() {
        System.out.println("电梯已经是停止状态。。。。。");
    }
}
