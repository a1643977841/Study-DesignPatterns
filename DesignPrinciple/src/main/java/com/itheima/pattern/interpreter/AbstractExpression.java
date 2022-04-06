package com.itheima.pattern.interpreter;

/**
 * <p>
 *  抽象表达式类
 * </p>
 *
 * @author Liu hao
 * @version 1.0
 * @date 2022/4/6 21:08
 */
public abstract class AbstractExpression {
    /**
     * 解析方法
     * @param context 环境上下文
     * @return 解析结果
     */
    public abstract int interpret(Context context);
}
