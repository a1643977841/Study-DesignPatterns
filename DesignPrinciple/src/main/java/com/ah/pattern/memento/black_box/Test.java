package com.ah.pattern.memento.black_box;

/**
 * <p>
 *  行为型模式----白箱备忘录模式<br /><br />
 *  备忘录角色对发起人对象提供一个宽接口，而为其他对象提供一个窄接口。在Java语言中，实现双重接口的办法就是将"备忘录类"设计成"发起人类"的内部成员类。<br /><br />
 *      优点：<br />
 *          1、提供了一种可以恢复状态的机制。当用户需要时能够比较方便地将数据恢复到某个历史的状态。<br />
 *          2、实现了内部状态的封装。除了创建它的发起人之外，其他对象都不能够访问这些状态信息。<br />
 *          3、简化了发起人类。发起人不需要管理和保存其内部状态的各个备份，所有状态信息都保存在备忘录中，并由管理者进行管理，这符合单一职责原则。<br /><br />
 *      缺点：<br />
 *          1、资源消耗大。如果要保存的内部状态信息过多或者特别频繁，将会占用比较大的内存资源。<br /><br />
 *      应用场景：<br />
 *          1、需要保存与恢复数据的场景，如玩游戏时的中间结果的存档功能。<br />
 *          2、需要提供一个可回滚操作的场景，如 Word、记事本、Photoshop，idea等软件在编辑时按 Ctrl+Z 组合键，还有数据库中事务操作。
 * </p>
 *
 * @author Liu hao
 * @version 1.0
 * @date 2022/4/6 20:22
 */
public class Test {

    public static void main(String[] args) {
        System.out.println("------------大战Boss前------------");
        GameRole gameRole = new GameRole();
        gameRole.initState();
        gameRole.stateDisplay();
        //保存进度
        RoleStateCaretaker roleStateMemento = new RoleStateCaretaker();
        roleStateMemento.setMemento(gameRole.saveState());
        System.out.println("------------大战Boss后------------");
        //大战Boss时，损耗严重
        gameRole.fight();
        gameRole.stateDisplay();
        System.out.println("------------恢复之前状态------------");
        gameRole.recoverState(roleStateMemento.getMemento());
        gameRole.stateDisplay();
    }
}
