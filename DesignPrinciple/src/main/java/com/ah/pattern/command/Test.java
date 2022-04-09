package com.ah.pattern.command;

/**
 * <p>
 *  行为型模式 ---- 命令模式
 *      优点：
 *          1、降低系统的耦合度。命令模式能将调用操作的对象与实现该操作的对象解耦。
 *          2、增加或删除命令非常方便。采用命令模式增加与删除命令不会影响其他类，它满足“开闭原则”，对扩展比较灵活。
 *          3、可以实现宏命令。命令模式可以与组合模式结合，将多个命令装配成一个组合命令，即宏命令。
 *          4、方便实现 Undo 和 Redo 操作。命令模式可以与后面介绍的备忘录模式结合，实现命令的撤销与恢复。
 *      缺点：
 *          1、使用命令模式可能会导致某些系统有过多的具体命令类。
 *          2、系统结构更加复杂。
 *      使用场景：
 *          1、系统需要将请求调用者和请求接收者解耦，使得调用者和接收者不直接交互。
 *          2、系统需要在不同的时间指定请求、将请求排队和执行请求。
 *          3、系统需要支持命令的撤销(Undo)操作和恢复(Redo)操作。
 * </p>
 *
 * @author LiuHao
 * @version V1.0
 * @date 2022/4/416:24
 */
public class Test {

    public static void main(String[] args) {
        //创建2个order
        Order order1 = new Order();
        order1.setDiningTable(1);
        order1.getFoodDic().put("西红柿鸡蛋面",1);
        order1.getFoodDic().put("小杯可乐",2);

        Order order2 = new Order();
        order2.setDiningTable(3);
        order2.getFoodDic().put("尖椒肉丝盖饭",1);
        order2.getFoodDic().put("小杯雪碧",1);

        //创建接收者
        SeniorChef receiver=new SeniorChef();
        //将订单和接收者封装成命令对象
        OrderCommand cmd1 = new OrderCommand(receiver, order1);
        OrderCommand cmd2 = new OrderCommand(receiver, order2);
        //创建调用者 waitor
        Waitor invoker = new Waitor();
        invoker.setCommand(cmd1);
        invoker.setCommand(cmd2);

        //将订单带到柜台 并向厨师喊 订单来了
        invoker.orderUp();
    }
}
