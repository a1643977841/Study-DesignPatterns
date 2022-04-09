package com.ah.pattern.combination;

/**
 * <p>
 *  菜单子项
 * </p>
 *
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/3022:34
 */
public class MenuItem extends MenuComponent{

    public MenuItem(String name, int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void print() {
        for (int i = 0; i < level; i++) {
            System.out.print("--");
        }
        System.out.println(this.name);
    }
}
