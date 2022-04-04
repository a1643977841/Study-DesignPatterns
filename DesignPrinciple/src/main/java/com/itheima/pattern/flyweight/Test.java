package com.itheima.pattern.flyweight;

/**
 * <p>
 *  结构型模式---享元模式
 *      优点：
 *          1、极大减少内存中相似或相同对象数量，节约系统资源，提供系统性能
 *          2、享元模式中的外部状态相对独立，且不影响内部状态
 *      缺点：
 *          1、为了使对象可以共享，需要将享元对象的部分状态外部化，分离内部状态和外部状态，使程序逻辑复杂
 *      使用场景：
 *          1、一个系统有大量相同或者相似的对象，造成内存的大量耗费。
 *          2、对象的大部分状态都可以外部化，可以将这些外部状态传入对象中。
 *          3、在使用享元模式时需要维护一个存储享元对象的享元池，而这需要耗费一定的系统资源，因此，应当在需要多次重复使用享元对象时才值得使用享元模式。
 * </p>
 *
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/3120:50
 */
public class Test {

    public static void main(String[] args) {
        BoxFactory instance = BoxFactory.getInstance();
        AbstractBox i = instance.getBox("I");
        i.getShape();
        i.display("绿色");
        AbstractBox l = instance.getBox("L");
        l.getShape();
        l.display("黄色");
        AbstractBox o = instance.getBox("O");
        o.getShape();
        o.display("红色");
        AbstractBox o1 = instance.getBox("O");
        AbstractBox o2 = instance.getBox("O");
        AbstractBox o3 = instance.getBox("O");
        AbstractBox o4 = instance.getBox("O");
        System.out.println(o);
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        System.out.println(o4);
    }
}
