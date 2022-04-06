package com.itheima.pattern.interpreter;

/**
 * <p>
 *  行为型模式----解释器模式 <br />
 *  给定一个语言，定义它的文法表示，并定义一个解释器，这个解释器使用该标识来解释语言中的句子。<br /><br />
 *      优点：<br />
 *          1、易于改变和扩展文法：由于在解释器模式中使用类来表示语言的文法规则，因此可以通过继承等机制来改变或扩展文法。每一条文法规则都可以表示为一个类，因此可以方便地实现一个简单的语言。<br />
 *          2、实现文法较为容易：在抽象语法树中每一个表达式节点类的实现方式都是相似的，这些类的代码编写都不会特别复杂。<br />
 *          3、增加新的解释表达式较为方便：如果用户需要增加新的解释表达式只需要对应增加一个新的终结符表达式或非终结符表达式类，原有表达式类代码无须修改，符合 "开闭原则"。<br /><br />
 *      缺点：<br />
 *          1、对于复杂文法难以维护：在解释器模式中，每一条规则至少需要定义一个类，因此如果一个语言包含太多文法规则，类的个数将会急剧增加，导致系统难以管理和维护。<br />
 *          2、执行效率较低：由于在解释器模式中使用了大量的循环和递归调用，因此在解释较为复杂的句子时其速度很慢，而且代码的调试过程也比较麻烦。<br /><br />
 *      使用场景：<br />
 *          1、当语言的文法较为简单，且执行效率不是关键问题时。<br />
 *          2、当问题重复出现，且可以用一种简单的语言来进行表达时。<br />
 *          3、当一个语言需要解释执行，并且语言中的句子可以表示为一个抽象语法树的时候。
 * </p>
 *
 * @author Liu hao
 * @version 1.0
 * @date 2022/4/6 21:07
 */
public class Test {
    public static void main(String[] args) {
        Context context = new Context();

        Variable a = new Variable("a");
        Variable b = new Variable("b");
        Variable c = new Variable("c");
        Variable d = new Variable("d");
        Variable e = new Variable("e");
        //Value v = new Value(1);

        context.assign(a, 1);
        context.assign(b, 2);
        context.assign(c, 3);
        context.assign(d, 4);
        context.assign(e, 5);

        AbstractExpression expression = new Minus(new Plus(new Plus(new Plus(a, b), c), d), e);

        System.out.println(expression + "= " + expression.interpret(context));
    }
}
