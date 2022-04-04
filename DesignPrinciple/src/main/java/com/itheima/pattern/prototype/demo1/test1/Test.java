package com.itheima.pattern.prototype.demo1.test1;

/**
 * 浅克隆：创建一个新对象，新对象的属性和原来的对象完全相同，对于非基本类型属性，仍指向原来的属性所指向的地址
 * @author LiuHao
 * @version V1.0
 * @date 2022/3/2311:25
 */
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        //Citation citation = new Citation();
        //Citation clone = citation.clone();
        //clone.setName("张三");
        //clone.show();
        //Citation clone1 = citation.clone();
        //clone1.setName("李四");
        //clone1.show();

        // 浅克隆
        Citation citation = new Citation();
        Student student = new Student();
        student.setName("Student1");
        citation.setStudent(student);
        Citation clone = citation.clone();
        clone.getStudent().setName("Student2");
        citation.show1();
        clone.show1();

    }
}
