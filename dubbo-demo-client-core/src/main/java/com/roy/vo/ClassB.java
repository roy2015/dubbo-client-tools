package com.roy.vo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author: jun.guo
 * @Email: jun.guo@rograndec.com
 * @CreateDate: 2019/1/7
 * @Version: 1.0
 */
@Component
public class ClassB {

    @Autowired
    ClassA classA;

    public ClassA getClassA() {
        return classA;
    }


}
