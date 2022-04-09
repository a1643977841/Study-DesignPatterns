package com.ah.pattern.mediator;

/**
 * <p>
 *  行为型模式 ---- 中介者模式<br /><br />
 *      优点：<br />
 *          1、中介者模式通过把多个同事对象之间的交互封装到中介者对象里面，从而使得同事对象之间松散耦合，基本上可以做到互补依赖。这样一来，同事对象就可以独立地变化和复用，而不再像以前那样“牵一处而动全身”了。<br />
 *          2、多个同事对象的交互，被封装在中介者对象里面集中管理，使得这些交互行为发生变化的时候，只需要修改中介者对象就可以了，当然如果是已经做好的系统，那么就扩展中介者对象，而各个同事类不需要做修改。<br />
 *          3、没有使用中介者模式的时候，同事对象之间的关系通常是一对多的，引入中介者对象以后，中介者对象和同事对象的关系通常变成双向的一对一，这会让对象的关系更容易理解和实现。<br /><br />
 *      缺点：<br />
 *          1、当同事类太多时，中介者的职责将很大，它会变得复杂而庞大，以至于系统难以维护<br /><br />
 *      使用场景：<br />
 *          1、系统中对象之间存在复杂的引用关系，系统结构混乱且难以理解。<br />
 *          2、当想创建一个运行于多个类之间的对象，又不想生成新的子类时。
 * </p>
 *
 * @author Liu hao
 * @version 1.0
 * @date 2022/4/5 22:07
 */
public class Test {
    public static void main(String[] args) {
        //一个房主、一个租房者、一个中介机构
        MediatorStructure mediator = new MediatorStructure();

        //房主和租房者只需要知道中介机构即可
        HouseOwner houseOwner = new HouseOwner("张三", mediator);
        Tenant tenant = new Tenant("李四", mediator);

        //中介结构要知道房主和租房者
        mediator.setHouseOwner(houseOwner);
        mediator.setTenant(tenant);

        tenant.constact("需要租三室的房子");
        houseOwner.constact("我这有三室的房子，你需要租吗？");
    }
}
