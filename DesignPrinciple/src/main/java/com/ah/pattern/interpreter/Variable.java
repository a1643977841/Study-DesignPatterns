package com.ah.pattern.interpreter;

import java.util.Objects;

/**
 * <p>
 *  终结符表达式角色 变量表达式
 * </p>
 *
 * @author Liu hao
 * @version 1.0
 * @date 2022/4/6 21:12
 */
public class Variable extends AbstractExpression{

    /**
     * 存储变量名的
     */
    private String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public int interpret(Context context) {
        return context.getValue(this);
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Variable variable = (Variable) o;
        return Objects.equals(name, variable.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
