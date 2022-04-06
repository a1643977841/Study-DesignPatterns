package com.itheima.pattern.interpreter;

/**
 * <p>
 *  终结符表达式角色
 * </p>
 *
 * @author Liu hao
 * @version 1.0
 * @date 2022/4/6 21:08
 */
public class Value extends AbstractExpression{
    private int value;

    public Value(int value) {
        this.value = value;
    }

    @Override
    public int interpret(Context context) {
        return value;
    }


    @Override
    public String toString() {
        return Integer.toString(value);
    }
}
