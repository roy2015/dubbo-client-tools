package com.roy;

import com.gdy.aop.dao.Dao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringAopDemo {

    @Test
    public void testAop() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-aop.xml");

        Dao dao = (Dao)ac.getBean("daoImpl");
        dao.select();
    }
}
