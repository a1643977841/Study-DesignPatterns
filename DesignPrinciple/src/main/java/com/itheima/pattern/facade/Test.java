package com.itheima.pattern.facade;

/**
 * <p>
 *  外观模式：
 *      好处：
 *          1、降低了子系统与客户端之间的耦合度，使得子系统的变化不会影响调用它的客户类。
 *          2、对客户屏蔽了子系统组件，减少了客户处理的对象数目，并使得子系统使用起来更加容易。
 *      缺点：
 *          1、不符合开闭原则，修改很麻烦。
 *      使用场景：
 *          1、对分层结构系统构建时，使用外观模式定义子系统中每层的入口点可以简化子系统之间的依赖关系。
 *          2、当一个复杂系统的子系统很多时，外观模式可以为系统设计一个简单的接口供外界访问。
 *          3、当客户端与多个子系统之间存在很大的联系时，引入外观模式可将它们分离，从而提高子系统的独立性和可移植性。
 * </p>
 *
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/3021:52
 */
public class Test {
    public static void main(String[] args) {
        // 创建智能音箱
        SmartApplicationFacade facade = new SmartApplicationFacade();
        // 控制家电
        facade.say("打开家电");
        // 关闭家电
        facade.say("关闭家电");

        facade.say("你好啊");
    }
}
