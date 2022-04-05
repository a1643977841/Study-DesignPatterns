package com.itheima.pattern.observer;

/**
 * <p>
 *  行为型模式---观察者模式
 *      优点：
 *          1、降低了目标与观察者之间的耦合关系，两者之间是抽象耦合关系。
 *          2、被观察者发送通知，所有注册的观察者都会收到消息【可以实现广播机制】
 *      缺点：
 *          1、如果观察者非常多的话，name所有的观察者收到被观察者发送的通知会耗时
 *          2、如果被观察者有循环依赖的话，那么被观察者发送通知会使观察者循环调用，会导致系统崩溃
 *      使用场景：
 *          1、对象间存在一对多关系，一个对象的状态发生改变会影响其他对象。
 *          2、当一个抽象模型有两个方面，其中一个方面依赖于另一方面时。
 * </p>
 *
 * @author Liu hao
 * @version 1.0
 * @date 2022/4/5 21:14
 */
public class Test {

    public static void main(String[] args) {
        // 创建主题对象
        SubscriptionSubject subject = new SubscriptionSubject();
        // 订阅公众号
        subject.attach(new WeiXinUser("孙悟空"));
        subject.attach(new WeiXinUser("猪八戒"));
        subject.attach(new WeiXinUser("沙悟净"));
        // 公众号更新，发消息给订阅者(观察者)
        subject.notify("阿浩来了。。。");
    }
}
