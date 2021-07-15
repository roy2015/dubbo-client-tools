package com.otherPkg;

import com.roy.vo.ClassA;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by apple on 2019/4/29.
 */
public class DynamicBeanB {
    private String name;
    private int age;

    @Autowired(required = false)
    private DynamicBeanA dynamicBeanA;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
