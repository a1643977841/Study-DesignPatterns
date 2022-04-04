package com.itheima.pattern.combination;

/**
 * <p>
 *  菜单组建
 * </p>
 *
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/3022:21
 */
public abstract class MenuComponent {
    /**
     * 菜单组件名称
     */
    protected String name;
    /**
     * 菜单组件层级
     */
    protected int level;

    /**
     * 添加子菜单
     * @param menuComponent 菜单
     */
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    /**
     * 移除菜单项目
     * @param menuComponent 菜单
     */
    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    /**
     * 获取指定子菜单
     * @param index 索引
     * @return 菜单
     */
    public MenuComponent getChild(int index) {
        throw new UnsupportedOperationException();
    }

    /**
     * 获取名称
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * 打印
     */
    public abstract void print();


}
