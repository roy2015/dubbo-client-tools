package com.roy;

import com.otherPkg.DynamicBeanA;
import com.otherPkg.DynamicBeanB;
import com.roy.vo.ClassA;
import com.roy.vo.circular.CiculatA;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author: jun.guo
 * @Email: jun.guo@rograndec.com
 * @CreateDate: 2019/1/7
 * @Version: 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:spring-demo.xml" })
public class TestSpringDemo  extends AbstractJUnit4SpringContextTests {

    @Autowired
    ClassA classA;

    @Test
    public void testSpringLoadProcess() {
        System.out.println( classA.getRedisUrl() );
    }

    @Test
    public void testCreateBeanOnConextRefreshed() {

        DefaultListableBeanFactory beanFactory = (DefaultListableBeanFactory) (super.applicationContext.getAutowireCapableBeanFactory());
//        BeanDefinitionBuilder bdb = BeanDefinitionBuilder.genericBeanDefinition(DynamicBeanA.class);
        RootBeanDefinition bd = new RootBeanDefinition(DynamicBeanA.class);
        beanFactory.registerBeanDefinition("dynamicBeanA", bd);
        DynamicBeanA beanA = beanFactory.getBean("dynamicBeanA", DynamicBeanA.class);
        System.out.println(beanA);

        RootBeanDefinition bd1 = new RootBeanDefinition(DynamicBeanB.class);
        beanFactory.registerBeanDefinition("dynamicBeanB", bd1);
        DynamicBeanB beanB = beanFactory.getBean("dynamicBeanB", DynamicBeanB.class);
        System.out.println(beanB);
    }

}
