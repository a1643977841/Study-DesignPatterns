package com.itheima.pattern.command;

import java.util.Set;

/**
 * <p>
 *  具体的命令对象，实现了Command接口
 * </p>
 *
 * @author LiuHao
 * @version V1.0
 * @date 2022/4/416:22
 */
public class OrderCommand implements Command {
    /**
     * 持有接受者对象
     */
    private SeniorChef receiver;
    private Order order;

    public OrderCommand(SeniorChef receiver, Order order){
        this.receiver = receiver;
        this.order = order;
    }
    @Override
    public void execute()  {
        System.out.println(order.getDiningTable() + "桌的订单：");
        Set<String> keys = order.getFoodDic().keySet();
        for (String key : keys) {
            receiver.makeFood(order.getFoodDic().get(key),key);
        }

        try {
            // 停顿一下 模拟做饭的过程
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(order.getDiningTable() + "桌的饭弄好了");
    }
}
