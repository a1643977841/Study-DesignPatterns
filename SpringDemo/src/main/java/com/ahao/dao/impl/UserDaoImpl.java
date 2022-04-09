package com.ahao.dao.impl;

import com.ahao.dao.UserDao;

/**
 * <p>
 *  数据访问层实现类
 * </p>
 *
 * @author Liu hao
 * @version 1.0
 * @date 2022/4/6 21:39
 */
public class UserDaoImpl implements UserDao {

    private String username;

    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void add() {
        System.out.println("UserDAO....." + username + ":" + password);
    }
}
