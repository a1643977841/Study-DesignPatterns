package com.ah.pattern.decorator;

/**
 * 快餐类
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2410:42
 */
public abstract class FastFood {
    /**
     * 价格
     */
    private float price;
    /**
     * 描述
     */
    private String desc;

    public FastFood(float price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    public FastFood() {
    }

    /**
     * 计算价格
     * @return 价格
     */
    public abstract float cast();


    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
