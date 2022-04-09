package com.ah.pattern.bridge;

/**
 * 桥接模式
 * 优点：
 *   1、桥接模式提高了系统的可扩充性，在两个变化维度中任意扩展一个维度，都不需要修改原有系统。
 *      如：如果现在还有一种视频文件类型wmv，我们只需要再定义一个类实现VideoFile接口即可，其他类不需要发生变化。
 *   2、实现细节对客户透明
 * 应用场景：
 *   1、当一个类存在两个独立变化的维度，且这两个维度都需要进行扩展时。
 *   2、当一个系统不希望使用继承或因为多层次继承导致系统类的个数急剧增加时。
 *   3、当一个系统需要在构件的抽象化角色和具体化角色之间增加更多的灵活性时。避免在两个层次之间建立静态的继承联系，通过桥接模式可以使它们在抽象层建立一个关联关系。
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2411:30
 */
public class Test {

    public static void main(String[] args) {
        // 创建mac系统对象
        OptionSystem system = new Mac(new AviFile());
        // 播放视频文件
        system.play("战狼3");

        system = new Mac(new RmvbFile());
        system.play("战狼3");
    }
}
