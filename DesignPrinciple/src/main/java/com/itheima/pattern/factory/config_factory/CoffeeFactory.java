package com.itheima.pattern.factory.config_factory;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

/**
 * 根据配置文件创建对象
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2300:04
 */
public class CoffeeFactory {
    private static HashMap<String, Coffee> map = new HashMap<>();

    static {
        // 加载bean.properties
        Properties properties = new Properties();
        InputStream resourceAsStream = CoffeeFactory.class.getClassLoader().getResourceAsStream("bean.properties");
        try {
            properties.load(resourceAsStream);
            Set<Object> keys = properties.keySet();
            for (Object key : keys) {
                String className = properties.getProperty(String.valueOf(key));
                // 通过反射加载类
                Class<?> aClass = Class.forName(className);
                Coffee coffee = (Coffee)aClass.newInstance();
                map.put(String.valueOf(key), coffee);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Coffee createCoffee(String name) {
        return map.get(name);
    }
}
