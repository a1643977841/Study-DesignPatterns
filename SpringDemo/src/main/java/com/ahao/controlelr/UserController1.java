package com.ahao.controlelr;

import com.ah.spring.context.ApplicationContext;
import com.ah.spring.context.support.ClassPathXmlApplicationContext;
import com.ahao.service.UserService;


/**
 * <p>
 *
 * </p>
 *
 * @author Liu hao
 * @version 1.0
 * @date 2022/4/6 21:53
 */
public class UserController1 {

    public static void main(String[] args) throws Exception {
        //创建spring容器对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        //从IOC容器中获取UserService对象
        UserService userService = applicationContext.getBean("userService", UserService.class);
        //调用UserService对象的add方法
        userService.add();
    }
}
