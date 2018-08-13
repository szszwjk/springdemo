package com.spring.test;

import com.spring.bean.User;
import com.spring.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void demo1()
    {
       ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
//        UserDao userDao=(UserDao) applicationContext.getBean("userDao");
//        userDao.sayHello();
        User user=(User) applicationContext.getBean("user");
        System.out.println(user.getAge());
        System.out.println(user.getName());
    }

    public void demo2()
    {

    }

}
