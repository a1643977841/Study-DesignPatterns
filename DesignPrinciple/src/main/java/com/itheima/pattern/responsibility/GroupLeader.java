package com.itheima.pattern.responsibility;

/**
 * <p>
 *  小组长类
 * </p>
 *
 * @author LiuHao
 * @version V1.0
 * @date 2022/4/416:56
 */
public class GroupLeader extends Handler {

    public GroupLeader() {
        //小组长处理1-3天的请假
        super(Handler.NUM_ONE, Handler.NUM_THREE);
    }

    public GroupLeader(int numStart) {
        super(numStart);
    }

    public GroupLeader(int numStart, int numEnd) {
        super(numStart, numEnd);
    }

    @Override
    protected void handleLeave(LeaveRequest leave) {
        System.out.println(leave.getName() + "请假" + leave.getNum() + "天," + leave.getContent() + "。");
        System.out.println("小组长审批：同意。");
    }
}
