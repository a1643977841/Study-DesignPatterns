package com.itheima.pattern.state;

/**
 * <p>
 *  行为型模式 ----状态模式
 *      优点：
 *          1、将所有与某个状态有关的行为放到一个类中，并且可以方便地增加新的状态，只需要改变对象状态即可改变对象的行为。
 *          2、允许状态转换逻辑与状态对象合成一体，而不是某一个巨大的条件语句块。
 *      缺点：
 *          1、状态模式的使用必然会增加系统类和对象的个数。
 *          2、状态模式的结构与实现都较为复杂，如果使用不当将导致程序结构和代码的混乱。
 *          3、状态模式对"开闭原则"的支持并不太好。
 *      使用场景：
 *          1、当一个对象的行为取决于它的状态，并且它必须在运行时根据状态改变它的行为时，就可以考虑使用状态模式。
 *          2、一个操作中含有庞大的分支结构，并且这些分支决定于对象的状态时。
 * </p>
 *
 * @author LiuHao
 * @version V1.0
 * @date 2022/4/500:03
 */
public class Test {

    public static void main(String[] args) {
        Context context = new Context();
        context.setLiftState(new RunningState());

        context.close();
        context.run();
        context.stop();
        context.open();
    }
}
