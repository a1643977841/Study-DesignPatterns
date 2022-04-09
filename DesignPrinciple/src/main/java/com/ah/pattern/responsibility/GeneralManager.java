package com.ah.pattern.responsibility;

/**
 * <p>
 *  总经理类
 * </p>
 *
 * @author LiuHao
 * @version V1.0
 * @date 2022/4/416:57
 */
public class GeneralManager extends Handler {

    public GeneralManager() {
        //部门经理处理7天以上的请假
        super(Handler.NUM_SEVEN);
    }

    public GeneralManager(int numStart) {
        super(numStart);
    }

    public GeneralManager(int numStart, int numEnd) {
        super(numStart, numEnd);
    }

    @Override
    protected void handleLeave(LeaveRequest leave) {
        System.out.println(leave.getName() + "请假" + leave.getNum() + "天," + leave.getContent() + "。");
        System.out.println("总经理审批：同意。");
    }
}
