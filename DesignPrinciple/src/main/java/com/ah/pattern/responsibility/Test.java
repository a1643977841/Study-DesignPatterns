package com.ah.pattern.responsibility;

/**
 * <p>
 *  行为型模式----责任链模式
 *      优点：
 *          1、降低了对象之间的耦合度
 *          2、该模式降低了请求发送者和接收者的耦合度。
 *          3、增强了系统的可扩展性
 *          4、可以根据需要增加新的请求处理类，满足开闭原则。
 *          5、增强了给对象指派职责的灵活性
 *          6、当工作流程发生变化，可以动态地改变链内的成员或者修改它们的次序，也可动态地新增或者删除责任。
 *          7、责任链简化了对象之间的连接
 *          8、一个对象只需保持一个指向其后继者的引用，不需保持其他所有处理者的引用，这避免了使用众多的 if 或者 if···else 语句。
 *          9、责任分担
 *          10、每个类只需要处理自己该处理的工作，不能处理的传递给下一个对象完成，明确各类的责任范围，符合类的单一职责原则。
 *      缺点：
 *          1、不能保证每个请求一定被处理。由于一个请求没有明确的接收者，所以不能保证它一定会被处理，该请求可能一直传到链的末端都得不到处理。
 *          2、对比较长的职责链，请求的处理可能涉及多个处理对象，系统性能将受到一定影响。
 *          3、职责链建立的合理性要靠客户端来保证，增加了客户端的复杂性，可能会由于职责链的错误设置而导致系统出错，如可能会造成循环调用。
 * </p>
 *
 * @author LiuHao
 * @version V1.0
 * @date 2022/4/416:58
 */
public class Test {

    public static void main(String[] args) {
        //请假条来一张
        LeaveRequest leave = new LeaveRequest("小花",5,"身体不适");

        //各位领导
        GroupLeader groupLeader = new GroupLeader();
        Manager manager = new Manager();
        GeneralManager generalManager = new GeneralManager();
        //小组长的领导是部门经理
        groupLeader.setNextHandler(manager);
        // 部门经理的领导是总经理
        manager.setNextHandler(generalManager);
        //之所以在这里设置上级领导，是因为可以根据实际需求来更改设置，如果实战中上级领导人都是固定的，则可以移到领导实现类中。

        //提交申请
        groupLeader.submit(leave);
    }
}
