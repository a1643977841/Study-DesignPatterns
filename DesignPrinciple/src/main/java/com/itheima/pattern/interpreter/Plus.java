package com.itheima.pattern.interpreter;

/**
 * <p>
 *  非终结符表达式角色  加法表达式
 * </p>
 *
 * @author Liu hao
 * @version 1.0
 * @date 2022/4/6 21:13
 */
public class Plus extends AbstractExpression{
    /**
     * +号左边的表达式
     */
    private AbstractExpression left;
    /**
     * +号右边的表达式
     */
    private AbstractExpression right;


    public Plus(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context context) {
        return left.interpret(context) + right.interpret(context);
    }
    @Override
    public String toString() {
        return "(" + left.toString() + " + " + right.toString() + ")";
    }
}
