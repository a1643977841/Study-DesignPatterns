package com.itheima.pattern.interpreter;

/**
 * <p>
 *  非终结符表达式角色 减法表达式
 * </p>
 *
 * @author Liu hao
 * @version 1.0
 * @date 2022/4/6 21:15
 */
public class Minus extends AbstractExpression{
    /**
     * 减号左边的表达式
     */
    private AbstractExpression left;
    /**
     * 减号右边的表达式
     */
    private AbstractExpression right;

    public Minus(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context context) {
        return left.interpret(context) - right.interpret(context);
    }

    @Override
    public String toString() {
        return "(" + left.toString() + " - " + right.toString() + ")";
    }
}
