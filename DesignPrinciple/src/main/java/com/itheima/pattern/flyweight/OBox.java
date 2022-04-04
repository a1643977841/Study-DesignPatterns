package com.itheima.pattern.flyweight;

/**
 * <p>
 *  O图形类
 * </p>
 *
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/3120:45
 */
public class OBox extends AbstractBox{

    /**
     *
     * @return 图形
     */
    @Override
    public String getShape() {
        return "O";
    }
}
