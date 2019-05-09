package com.roy;

import com.rogrand.common.util.MD5;
import com.roy.dubbo.MainTestService;
import com.roy.dubbo.exception.HelloWorldException;
import com.roy.dubbo.provider.service.demo.DemoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanCurrentlyInCreationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;

/**
 * @Author: jun.guo
 * @Email: jun.guo@rograndec.com
 * @CreateDate: 2018/12/12 0012
 * @Version: 1.0
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:dubbo-demo-service.xml" })
public class TestDubboDemoService extends AbstractJUnit4SpringContextTests {

    @Autowired
    private DemoService demoService;

    @Test
    public void testAdd() throws IOException {
        Integer add = demoService.add(1, 2);
        System.out.println(add);
        System.in.read();
    }

    @Test
    public void testThrowException() {

        try {
            String s = demoService.throwException();
            System.in.read();
        } catch (HelloWorldException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (BeanCurrentlyInCreationException e) {
            e.printStackTrace();
        }
    }

}
