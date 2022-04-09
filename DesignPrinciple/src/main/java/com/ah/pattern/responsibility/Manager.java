package com.ah.pattern.responsibility;

/**
 * <p>
 *  部门经理类
 * </p>
 *
 * @author LiuHao
 * @version V1.0
 * @date 2022/4/416:57
 */
public class Manager extends Handler {

    public Manager() {
        //部门经理处理3-7天的请假
        super(Handler.NUM_THREE, Handler.NUM_SEVEN);
    }

    public Manager(int numStart) {
        super(numStart);
    }

    public Manager(int numStart, int numEnd) {
        super(numStart, numEnd);
    }

    @Override
    protected void handleLeave(LeaveRequest leave) {
        System.out.println(leave.getName() + "请假" + leave.getNum() + "天," + leave.getContent() + "。");
        System.out.println("部门经理审批：同意。");
    }
}
