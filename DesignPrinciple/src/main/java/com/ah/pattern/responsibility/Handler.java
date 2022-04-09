package com.ah.pattern.responsibility;

/**
 * <p>
 *
 * </p>
 *
 * @author LiuHao
 * @version V1.0
 * @date 2022/4/416:51
 */
public abstract class Handler {

    protected final static int NUM_ONE = 1;
    protected final static int NUM_THREE = 3;
    protected final static int NUM_SEVEN = 7;


    public Handler() {
    }

    /**
     * 该领导处理的请假天数区间
     */
    private int numStart;
    private int numEnd;

    /**
     * 领导上面还有领导
     */
    private Handler nextHandler;


    /**
     * 设置请假天数范围 上不封顶
     * @param numStart 天数开始
     */
    public Handler(int numStart) {
        this.numStart = numStart;
    }

    /**
     * 设置请假天数范围
     * @param numStart 开始
     * @param numEnd 结束
     */
    public Handler(int numStart, int numEnd) {
        this.numStart = numStart;
        this.numEnd = numEnd;
    }
    /**
     * 设置上级领导
     * @param nextHandler 上级领导
     */
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    /**
     * 提交请假条
     * @param leave 请假套
     */
    public final void submit(LeaveRequest leave){
        if(0 == this.numStart){
            return;
        }
        //如果请假天数达到该领导者的处理要求
        if(leave.getNum() >= this.numStart){
            this.handleLeave(leave);

            //如果还有上级 并且请假天数超过了当前领导的处理范围
            if(null != this.nextHandler && leave.getNum() > numEnd){
                //继续提交
                this.nextHandler.submit(leave);
            } else {
                System.out.println("流程结束");
            }
        }
    }

    /**
     * 各级领导处理请假条方法
     * @param leave 请假条
     */
    protected abstract void handleLeave(LeaveRequest leave);


    public int getNumStart() {
        return numStart;
    }

    public void setNumStart(int numStart) {
        this.numStart = numStart;
    }

    public int getNumEnd() {
        return numEnd;
    }

    public void setNumEnd(int numEnd) {
        this.numEnd = numEnd;
    }

    public Handler getNextHandler() {
        return nextHandler;
    }

}
