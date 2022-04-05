package com.itheima.pattern.mediator;

/**
 * <p>
 *  具体中介机构
 * </p>
 *
 * @author Liu hao
 * @version 1.0
 * @date 2022/4/5 22:03
 */
public class MediatorStructure extends Mediator{
    /**
     * 首先中介机构必须知道所有房主和租房者信息
     */
    private HouseOwner houseOwner;
    private Tenant tenant;


    @Override
    public void constact(String message, Person person) {
        // 判断谁来沟通，如果是房主，则租房者获得信息，反之则是房主获得信息
        if (person instanceof HouseOwner){
            tenant.getMessage(message);
        } else {
            houseOwner.getMessage(message);
        }
    }


    public HouseOwner getHouseOwner() {
        return houseOwner;
    }

    public void setHouseOwner(HouseOwner houseOwner) {
        this.houseOwner = houseOwner;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }
}
