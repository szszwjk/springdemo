package com.spring.daoimpl;

import com.spring.dao.UserDao;

public class UserDaoImpl implements UserDao {
    @Override
    public void sayHello() {
        System.out.println("hello");
    }
}
