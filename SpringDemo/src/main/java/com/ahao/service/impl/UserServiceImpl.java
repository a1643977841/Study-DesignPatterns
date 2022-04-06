package com.ahao.service.impl;

import com.ahao.dao.UserDao;
import com.ahao.service.UserService;

/**
 * <p>
 *  业务逻辑层实现类
 * </p>
 *
 * @author Liu hao
 * @version 1.0
 * @date 2022/4/6 21:50
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void add() {
        System.out.println("userServiceImpl ...");
        userDao.add();
    }
}
