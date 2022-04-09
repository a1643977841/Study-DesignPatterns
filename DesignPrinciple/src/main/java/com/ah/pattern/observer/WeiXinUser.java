package com.ah.pattern.observer;

/**
 * <p>
 *  具体的观察者，实现更新的方法，并保存自己的状态
 * </p>
 *
 * @author Liu hao
 * @version 1.0
 * @date 2022/4/5 21:12
 */
public class WeiXinUser implements Observer{
    private String name;

    public WeiXinUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + "-" + message);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
