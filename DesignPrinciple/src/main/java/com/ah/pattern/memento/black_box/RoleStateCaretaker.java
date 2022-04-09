package com.ah.pattern.memento.black_box;

/**
 * <p>
 *  角色状态管理者类
 * </p>
 *
 * @author Liu hao
 * @version 1.0
 * @date 2022/4/6 20:32
 */
public class RoleStateCaretaker {

    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
