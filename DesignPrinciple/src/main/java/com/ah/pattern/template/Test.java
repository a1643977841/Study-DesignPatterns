package com.ah.pattern.template;

/**
 * <p>
 *  模版方法模式：
 *      优点：
 *          1、提高代码复用性
 *          2、将相同部分的代码放在抽象的父类中，而将不同的代码放入不同的子类中。
 *          3、实现了反向控制
 *          4、通过一个父类调用其子类的操作，通过对子类的具体实现扩展不同的行为，实现了反向控制 ，并符合“开闭原则”。
 *      缺点：
 *          1、对每个不同的实现都需要定义一个子类，这会导致类的个数增加，系统更加庞大，设计也更加抽象。
 *          2、父类中的抽象方法由子类实现，子类执行的结果会影响父类的结果，这导致一种反向的控制结构，它提高了代码阅读的难度。
 *      应用场景
 *          1、算法的整体步骤很固定，但其中个别部分易变时，这时候可以使用模板方法模式，将容易变的部分抽象出来，供子类实现。
 *          3、需要通过子类来决定父类算法中某个步骤是否执行，实现子类对父类的反向控制。
 *      案例：
 *          1、炒菜的步骤是固定的，分为倒油、热油、倒蔬菜、倒调料品、翻炒等步骤。现通过模板方法模式来用代码模拟
 * </p>
 *
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/3122:18
 */
public class Test {
    public static void main(String[] args) {
        //炒手撕包菜
        ConcreteClass_BaoCai baoCai = new ConcreteClass_BaoCai();
        baoCai.cookProcess();

        //炒蒜蓉菜心
        ConcreteClass_CaiXin caiXin = new ConcreteClass_CaiXin();
        caiXin.cookProcess();

    }
}
