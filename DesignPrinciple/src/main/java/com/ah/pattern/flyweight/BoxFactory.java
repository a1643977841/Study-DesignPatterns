package com.ah.pattern.flyweight;

import java.util.HashMap;

/**
 * <p>
 *  工厂类
 *  该类设计为单例设计模式
 *  饿汉式
 * </p>
 *
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/3120:48
 */
public class BoxFactory {

    private static HashMap<String, AbstractBox> map;

    private BoxFactory() {
        map = new HashMap<String, AbstractBox>();
        AbstractBox iBox = new IBox();
        AbstractBox lBox = new LBox();
        AbstractBox oBox = new OBox();
        map.put("I", iBox);
        map.put("L", lBox);
        map.put("O", oBox);
    }

    public static BoxFactory getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final BoxFactory INSTANCE = new BoxFactory();
    }

    public AbstractBox getBox(String key) {
        return map.get(key);
    }
}
