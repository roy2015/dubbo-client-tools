package com.roy;

import com.roy.object.AudiCar;
import com.roy.object.Car;
import com.roy.object.CarFactoryBean;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: jun.guo
 * @Email: jun.guo@rograndec.com
 * @CreateDate: 2019/1/7
 * @Version: 1.0
 */
public class TestSpringDemo1{

    public static void main(String[] args) {
        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "classpath*:spring-test.xml");

        CarFactoryBean myFactoryBean = (CarFactoryBean) applicationContext.getBean("&carFactoryBean");
        Car car = (Car) applicationContext.getBean("carFactoryBean");
        //直接factoryBean注入进去的car
        Object carService = applicationContext.getBean("carService");
        System.out.println(car);
        int i =0;

    }


}
