package com.roy.dubbo.com.roy.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: jun.guo
 * @Email: jun.guo@rograndec.com
 * @CreateDate: 2019/1/8 0008
 * @Version: 1.0
 */
public class MainTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext cpxac = new ClassPathXmlApplicationContext(
          "classpath*:spring-demo.xml"
        );
        cpxac.start();

    }
}
