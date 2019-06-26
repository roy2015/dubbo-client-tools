package com.roy;

import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.alibaba.dubbo.config.spring.extension.SpringExtensionFactory;
import com.otherPkg.DynamicBeanA;
import com.otherPkg.DynamicBeanB;
import com.roy.spi.Car;
import com.roy.vo.ClassA;
import com.roy.vo.ClassC;
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

    @Autowired
    ClassC classC;

    /**
     * 测试注入property value
     */
    @Test
    public void testSpringLoadProcess() {
        System.out.println( classA.getRedisUrl() );
        System.out.println(classA.getBirthDate());
        logger.debug(classA.getUser());
        logger.debug(classC.getUser());
    }

    /**
     * 测试动态beandefinition
     */
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

    /**
     * 测试dubbo spi
     */
    @Test
    public void testSpi() {
        SpringExtensionFactory.addApplicationContext(applicationContext);
        Car car = ExtensionLoader.getExtensionLoader(Car.class).getExtension("lamborghini");
        System.out.println(car);
    }

}
