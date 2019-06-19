package com.roy.vo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Author: jun.guo
 * @Email: jun.guo@rograndec.com
 * @CreateDate: 2019/1/7 0007
 * @Version: 1.0
 */

@Component
/**
 * 测试主类
 */
public class ClassA {

    @Value("${redis.addr}")
    private String redisUrl;

    @Value("${birthDate}")
    private Date birthDate;

    @Autowired
    ClassB classB;

    public ClassB getClassB() {
        return classB;
    }

    public String getRedisUrl() {
        return redisUrl;
    }

    public Date getBirthDate() {
        return birthDate;
    }
}
