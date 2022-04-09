package com.ah.pattern.state;

/**
 * <p>
 *  环境角色类
 * </p>
 *
 * @author LiuHao
 * @version V1.0
 * @date 2022/4/500:07
 */
public class Context {

    /**
     * 定义出所有的电梯状态
     * 开门状态，这时候电梯只能关闭
     */
    public final static OpenNingState OPEN_NING_STATE = new OpenNingState();
    /**
     * 关闭状态，这时候电梯可以运行、停止和开门
     */
    public final static ClosingState CLOSING_STATE = new ClosingState();
    /**
     * 运行状态，这时候电梯只能停止
     */
    public final static RunningState RUNNING_STATE = new RunningState();
    /**
     * 停止状态，这时候电梯可以开门、运行
     */
    public final static StoppingState STOPPING_STATE = new StoppingState();
    /**
     * 定义一个当前电梯状态
     */
    private LiftState liftState;

    public LiftState getLiftState() {
        return liftState;
    }

    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
        //  把当前环境通知到各个实现中
        this.liftState.setContext(this);
    }

    public void open() {
        this.liftState.open();
    }

    public void close() {
        this.liftState.close();
    }

    public void run() {
        this.liftState.run();
    }

    public void stop() {
        this.liftState.stop();
    }
}
