package com.ah.pattern.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 *
 * </p>
 *
 * @author Liu hao
 * @version 1.0
 * @date 2022/4/6 21:09
 */
public class Context {
    /**
     * 用来存储变量和对应的值
     */
    private final Map<Variable, Integer> map = new HashMap<>();

    /**
     * 添加变量的功能
     * @param var 变量key
     * @param value 值
     */
    public void assign(Variable var, Integer value) {
        map.put(var, value);
    }

    /**
     * 根据变量获取对应值
     * @param var 变量key
     * @return 值
     */
    public int getValue(Variable var) {
        return map.get(var);
    }
}
