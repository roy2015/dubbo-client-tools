package com.roy;

import com.rogrand.common.util.MD5;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/** 融贯的测试，废弃
 * @Author: jun.guo
 * @Email: jun.guo@rograndec.com
 * @CreateDate: 2018/12/12 0012
 * @Version: 1.0
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:dubbo-service.xml" })
public class TestRograndecDemo extends AbstractJUnit4SpringContextTests {

    @Test
    public void test1() {
        int k1 = -10;
        System.out.println( (Integer.toBinaryString(k1)) );
        int k2 = 10;
        System.out.println( (Integer.toBinaryString(k2)) );

        int k3 = 10;
        System.out.println( (Integer.toHexString( k3 << 2)) );

        byte[] bb = new byte[] {-1,22,3,7};
        String hs = "", tmp = "";
        for (byte e : bb) {
            tmp = (Integer.toHexString(e & 0xFF));
            hs = tmp.length() == 1 ? hs + "0" + tmp : hs + tmp;
        }

        System.out.println( new MD5().mphMD5Code("888888", "mypharma") );
    }
}
