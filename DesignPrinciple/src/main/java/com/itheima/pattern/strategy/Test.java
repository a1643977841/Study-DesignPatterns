package com.itheima.pattern.strategy;

/**
 * <p>
 *  行为型模式----策略模式
 *  优点：
 *      1、策略类之间可以自由切换
 *      2、由于策略类都实现同一个接口，所以使它们之间可以自由切换。
 *      3、易于扩展
 *      4、增加一个新的策略只需要添加一个具体的策略类即可，基本不需要改变原有的代码，符合“开闭原则“
 *      5、避免使用多重条件选择语句（if else），充分体现面向对象设计思想。
 *
 *  缺点：
 *      1、客户端必须知道所有的策略类，并自行决定使用哪一个策略类。
 *      2、策略模式将造成产生很多策略类，可以通过使用享元模式在一定程度上减少对象的数量。
 *  使用场景：
 *      1、一个系统需要动态地在几种算法中选择一种时，可将每个算法封装到策略类中。
 *      2、一个类定义了多种行为，并且这些行为在这个类的操作中以多个条件语句的形式出现，可将每个条件分支移入它们各自的策略类中以代替这些条件语句。
 *      3、系统中各算法彼此完全独立，且要求对客户隐藏具体算法的实现细节时。
 *      4、系统要求使用算法的客户不应该知道其操作的数据时，可使用策略模式来隐藏与算法相关的数据结构。
 *      5、多个类只区别在表现行为不同，可以使用策略模式，在运行时动态选择具体要执行的行为。
 * </p>
 *
 * @author LiuHao
 * @version V1.0
 * @date 2022/4/415:30
 */
public class Test {

    public static void main(String[] args) {
        SalesMan salesMan = new SalesMan(new StrategyA());
        salesMan.salesManShow();
        salesMan = new SalesMan(new StrategyB());
        salesMan.salesManShow();
        new SalesMan(new StrategyC()).salesManShow();
    }
}
