package com.qjg.bean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {

    @Test
    public void appUser1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("dao/bean.xml");
        User user = (User) applicationContext.getBean("user1");
        System.out.println(user.toString());
    }


}
