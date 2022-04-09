package com.ah.spring.utils;

/**
 * <p>
 *
 * </p>
 *
 * @author Liu hao
 * @version 1.0
 * @date 2022/4/9 21:16
 */
public class StringUtils {
    private StringUtils() {}

    /**
     * 处理方法
     * 例如 userDao ---》 setUserDao
     * @param propertyName nick
     * @return nick
     */
    public static String getSetterMethodNameByFieldName(String propertyName) {
        String methodName = null;
        if (propertyName != null && propertyName.length() != 0) {
            methodName = "set" + propertyName.substring(0, 1).toUpperCase() + propertyName.substring(1);
        }
        return methodName;
    }
}
