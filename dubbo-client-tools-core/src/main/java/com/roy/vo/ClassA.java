package com.roy.vo;

import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author: jun.guo
 * @Email: jun.guo@rograndec.com
 * @CreateDate: 2019/1/7 0007
 * @Version: 1.0
 */

@Component
public class ClassA {

    @Value("${redis.addr}")
    private String redisUrl;

    @Autowired
    ClassB classB;

    public ClassB getClassB() {
        return classB;
    }

    public String getRedisUrl() {
        return redisUrl;
    }
}
