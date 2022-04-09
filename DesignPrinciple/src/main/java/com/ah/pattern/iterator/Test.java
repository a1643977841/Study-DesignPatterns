package com.ah.pattern.iterator;

/**
 * <p>
 *  行为型模式---迭代器模式<br /><br />
 *      优点：<br />
 *          1、它支持以不同的方式遍历一个聚合对象，在同一个聚合对象上可以定义多种遍历方式。在迭代器模式中只需要用一个不同的迭代器来替换原有迭代器即可改变遍历算法，我们也可以自己定义迭代器的子类以支持新的遍历方式。<br />
 *          2、迭代器简化了聚合类。由于引入了迭代器，在原有的聚合对象中不需要再自行提供数据遍历等方法，这样可以简化聚合类的设计。<br />
 *          3、在迭代器模式中，由于引入了抽象层，增加新的聚合类和迭代器类都很方便，无须修改原有代码，满足 “开闭原则” 的要求。<br /><br />
 *      缺点：<br />
 *          1、增加了类的个数，这在一定程度上增加了系统的复杂性。<br /><br />
 *      使用场景：<br />
 *          1、当需要为聚合对象提供多种遍历方式时。<br />
 *          2、当需要为遍历不同的聚合结构提供一个统一的接口时。<br />
 *          3、当访问一个聚合对象的内容而无须暴露其内部细节的表示时。<br />
 * </p>
 *
 * @author Liu hao
 * @version 1.0
 * @date 2022/4/5 22:41
 */
public class Test {
    public static void main(String[] args) {
        // 创建聚合对象
        StudentAggregateImpl aggregate = new StudentAggregateImpl();
        // 添加元素
        aggregate.add(new Student("张三", "001"));
        aggregate.add(new Student("李四", "002"));
        aggregate.add(new Student("王五", "003"));
        aggregate.add(new Student("赵六", "004"));
        // 获取迭代器对象
        Iterator<Student> studentIterator = aggregate.getIterator();
        while(studentIterator.hasNext()) {
            Student student = studentIterator.next();
            System.out.println(student);
        }
    }
}
