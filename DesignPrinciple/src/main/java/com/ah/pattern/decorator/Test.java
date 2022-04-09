package com.ah.pattern.decorator;

/**
 * 装饰着模式
 * 优点：
 *   1、饰者模式可以带来比继承更加灵活性的扩展功能，使用更加方便，可以通过组合不同的装饰者对象来获取具有不同行为状态的多样化的结果。装饰者模式比继承更具良好的扩展性，完美的遵循开闭原则，继承是静态的附加责任，装饰者则是动态的附加责任。
 *   2、装饰类和被装饰类可以独立发展，不会相互耦合，装饰模式是继承的一个替代模式，装饰模式可以动态扩展一个实现类的功能。
 * 使用场景：
 *   1、当不能采用继承的方式对系统进行扩充或者采用继承不利于系统扩展和维护时。
 *     不能采用继承的情况主要有两类：
 *       1）第一类是系统中存在大量独立的扩展，为支持每一种组合将产生大量的子类，使得子类数目呈爆炸性增长；
 *       2）第二类是为类定义不能继承（如final类）
 *   2、在不影响其他对象的情况下，以动态、透明的方式给单个对象添加职责。
 *   3、当对象的功能要求可以动态地添加，也可以再动态地撤销时。
 *
 * 静态代理和装饰者模式的区别：
 *   相同点：
 *     1、都要实现与目标类相同的业务接口
 *     2、在两个类中都要声明目标对象
 *     3、都可以在不修改目标类的前提下增强目标方法
 *   不同点：
 *     1、目的不同 装饰者是为了增强目标对象 静态代理是为了保护和隐藏目标对象
 *     2、获取目标对象构建的地方不同 装饰者是由外界传递进来，可以通过构造方法传递 静态代理是在代理类内部创建，以此来隐藏目标对象
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2410:56
 */
public class Test
{
    public static void main(String[] args) {
        // 点一份炒粉
        FastFood friedRice = new FriedRice();
        System.out.println(friedRice.getDesc() + "：" + friedRice.cast() + "元");
        System.out.println("==============================");

        // 在上面炒饭中 加一个鸡蛋
        friedRice = new Egg(friedRice);
        System.out.println(friedRice.getDesc() + "：" + friedRice.cast() + "元");
        System.out.println("==============================");
        // 在加一个鸡蛋
        friedRice = new Egg(friedRice);
        System.out.println(friedRice.getDesc() + "：" + friedRice.cast() + "元");
        System.out.println("==============================");
        // 在加一个培根
        friedRice = new Bacon(friedRice);
        System.out.println(friedRice.getDesc() + "：" + friedRice.cast() + "元");
        System.out.println("==============================");

    }
}
