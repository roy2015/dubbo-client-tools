package com.roy;

import com.roy.object.*;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: jun.guo
 * @Email: jun.guo@rograndec.com
 * @CreateDate: 2019/1/7
 * @Version: 1.0
 */
public class TestSpringDemo1{

    @Test
    public void testFactoryBean() {
        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "classpath*:spring-test.xml");

        AudiCarFactoryBean myFactoryBean = (AudiCarFactoryBean) applicationContext.getBean("&audiCarFactoryBean");
        AudiCar audiCar = (AudiCar) applicationContext.getBean("audiCarFactoryBean");
        System.out.println(audiCar);
        //直接factoryBean注入进去的car
        AudiCarService audiCarService = (AudiCarService) applicationContext.getBean("audiCarService");
//        System.out.println(car);
        System.out.println(audiCarService.getCar());
        int i =0;

    }

    @Test
    public void testFactoryBean1() {
        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "classpath*:spring-test.xml");

        //直接factoryBean注入进去的car
        BenzCarService benzCarService = (BenzCarService) applicationContext.getBean("benzCarService");
        System.out.println(benzCarService.getCar());
        int i =0;

    }


}
