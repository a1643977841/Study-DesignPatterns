package com.itheima.pattern.memento.white_box;

/**
 * <p>
 *  角色状态管理者类
 * </p>
 *
 * @author Liu hao
 * @version 1.0
 * @date 2022/4/6 17:59
 */
public class RoleStateCaretaker {
    private RoleStateMemento roleStateMemento;

    /**
     * 获取备忘录
     * @return 备忘录
     */
    public RoleStateMemento getRoleStateMemento() {
        return roleStateMemento;
    }

    /**
     * 设置备忘录
     * @param roleStateMemento 备忘录
     */
    public void setRoleStateMemento(RoleStateMemento roleStateMemento) {
        this.roleStateMemento = roleStateMemento;
    }
}
