package com.ah.pattern.visitor;

/**
 * <p>
 *  行为型模式----访问者模式<br /><br />
 *      优点：<br />
 *          1、扩展性好：在不修改对象结构中的元素的情况下，为对象结构中的元素添加新的功能。<br />
 *          2、复用性好：通过访问者来定义整个对象结构通用的功能，从而提高复用程度<br />
 *          3、分离无关行为：通过访问者来分离无关的行为，把相关的行为封装在一起，构成一个访问者，这样每一个访问者的功能都比较单一。<br /><br />
 *      缺点：<br />
 *          1、对象结构变化很困难：在访问者模式中，每增加一个新的元素类，都要在每一个具体访问者类中增加相应的具体操作，这违背了“开闭原则”。<br />
 *          2、违反了依赖倒置原则：访问者模式依赖了具体类，而没有依赖抽象类<br /><br />
 *      使用场景：<br />
 *          1、对象结构相对稳定，但其操作算法经常变化的程序<br />
 *          2、对象结构中的对象需要提供多种不同且不相关的操作，而且要避免让这些操作的变化影响对象的结构。
 *
 * </p>
 *
 * @author Liu hao
 * @version 1.0
 * @date 2022/4/6 17:16
 */
public class Test {

    public static void main(String[] args) {
        Home home = new Home();
        home.add(new Dog());
        home.add(new Cat());
        // 主人对象
        Owner owner = new Owner();
        home.action(owner);
        // 其他对象
        Someone someone = new Someone();
        home.action(someone);
    }
}
