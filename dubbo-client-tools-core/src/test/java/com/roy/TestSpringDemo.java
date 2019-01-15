package com.roy;

import com.roy.vo.ClassA;
import com.roy.vo.circular.CiculatA;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author: jun.guo
 * @Email: jun.guo@rograndec.com
 * @CreateDate: 2019/1/7 0007
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

}
