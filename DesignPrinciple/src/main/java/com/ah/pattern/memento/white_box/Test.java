package com.ah.pattern.memento.white_box;

/**
 * <p>
 *  行为型模式----白箱备忘录模式<br /><br />
 *  白箱备忘录模式是破坏封装性的。但是通过程序员自律，同样可以在一定程度上实现模式的大部分用意<br /><br />
 *  备忘录角色对任何对象都提供一个接口，即宽接口，备忘录角色的内部所存储的状态就对所有对象公开。
 * </p>
 *
 * @author Liu hao
 * @version 1.0
 * @date 2022/4/6 18:00
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("大战BOSS前");
        GameRole gameRole = new GameRole();
        gameRole.init();
        gameRole.stateDisplay();

        // 保存进度
        RoleStateCaretaker roleStateCaretaker = new RoleStateCaretaker();
        roleStateCaretaker.setRoleStateMemento(gameRole.saveState());

        System.out.println("大战BOSS后");
        gameRole.fight();
        gameRole.stateDisplay();

        System.out.println("恢复之前的状态");
        gameRole.recoverState(roleStateCaretaker.getRoleStateMemento());
        gameRole.stateDisplay();
    }
}
