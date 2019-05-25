package com.otherPkg;

import com.roy.vo.ClassA;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by apple on 2019/4/29.
 */
public class DynamicBeanA {
    private String name;
    private int age;

    private ClassA classA;

    @Autowired
    private void setClassA (ClassA classA) {
        this.classA = classA;
    }

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
