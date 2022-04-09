package com.ah.pattern.combination;

/**
 * <p>
 *  结构型模式--组合模式:
 *      分类：
 *          1、透明组合模式：
 *              透明组合模式中，抽象根节点角色中声明了所有用于管理成员对象的方法，比如在示例中 MenuComponent 声明了 add、remove 、getChild 方法，这样做的好处是确保所有的构件类都有相同的接口。透明组合模式也是组合模式的标准形式。
 *              透明组合模式的缺点是不够安全，因为叶子对象和容器对象在本质上是有区别的，叶子对象不可能有下一个层次的对象，即不可能包含成员对象，因此为其提供 add()、remove() 等方法是没有意义的，这在编译阶段不会出错，但在运行阶段如果调用这些方法可能会出错（如果没有提供相应的错误处理代码）
 *
 *          2、安全组合模式
 *              在安全组合模式中，在抽象构件角色中没有声明任何用于管理成员对象的方法，而是在树枝节点 Menu 类中声明并实现这些方法。安全组合模式的缺点是不够透明，因为叶子构件和容器构件具有不同的方法，且容器构件中那些用于管理成员对象的方法没有在抽象构件类中定义，因此客户端不能完全针对抽象编程，必须有区别地对待叶子构件和容器构件。
 *      优点：
 *          1、组合模式可以清楚地定义分层次的复杂对象，表示对象的全部或部分层次，它让客户端忽略了层次的差异，方便对整个层次结构进行控制。
 *          2、客户端可以一致地使用一个组合结构或其中单个对象，不必关心处理的是单个对象还是整个组合结构，简化了客户端代码。
 *          3、在组合模式中增加新的树枝节点和叶子节点都很方便，无须对现有类库进行任何修改，符合“开闭原则”。
 *          4、组合模式为树形结构的面向对象实现提供了一种灵活的解决方案，通过叶子节点和树枝节点的递归组合，可以形成复杂的树形结构，但对树形结构的控制却非常简单。
 *      使用场景：
 *          1、组合模式正是应树形结构而生，所以组合模式的使用场景就是出现树形结构的地方。比如：文件目录显示，多级目录呈现等树形结构数据的操作。
 * </p>
 *
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/3022:36
 */
public class Test {

    public static void main(String[] args) {
        MenuComponent menuComponent1 = new Menu("菜单管理", 2);
        menuComponent1.add(new MenuItem("页面访问", 3));
        menuComponent1.add(new MenuItem("展开菜单", 3));
        menuComponent1.add(new MenuItem("编辑菜单", 3));
        menuComponent1.add(new MenuItem("删除菜单", 3));
        menuComponent1.add(new MenuItem("新增菜单", 3));
        MenuComponent menuComponent2 = new Menu("权限管理", 2);
        menuComponent2.add(new MenuItem("页面访问", 3));
        menuComponent2.add(new MenuItem("提交保存", 3));
        MenuComponent menuComponent3 = new Menu("角色管理", 2);
        menuComponent3.add(new MenuItem("页面访问", 3));
        menuComponent3.add(new MenuItem("新增角色", 3));
        menuComponent3.add(new MenuItem("修改角色", 3));

        // 创建一级菜单
        MenuComponent component = new Menu("系统管理", 1);
        component.add(menuComponent1);
        component.add(menuComponent2);
        component.add(menuComponent3);

        component.print();
    }
}
