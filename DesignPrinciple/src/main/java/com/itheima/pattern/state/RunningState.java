package com.itheima.pattern.state;

/**
 * <p>
 *  电梯运行状态类
 * </p>
 *
 * @author LiuHao
 * @version V1.0
 * @date 2022/4/500:10
 */
public class RunningState extends LiftState {
    /**
     * 运行的时候开电梯门？你疯了！电梯不会给你开的
     */
    @Override
    public void open() {
        System.out.println("电梯运行中，不允许开门");
    }

    /**
     * 电梯门关闭？这是肯定了
     */
    @Override
    public void close() {//虽然可以关门，但这个动作不归我执行
        System.out.println("电梯已经是关门状态");
    }

    /**
     * 这是在运行状态下要实现的方法
     */
    @Override
    public void run() {

        System.out.println("电梯正在运行...");
    }

    /**
     * 这个事绝对是合理的，光运行不停止还有谁敢做这个电梯？！估计只有上帝了
     */
    @Override
    public void stop() {
        super.context.setLiftState(Context.STOPPING_STATE);
        super.context.stop();
    }
}
