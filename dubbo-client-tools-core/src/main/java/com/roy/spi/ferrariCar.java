package com.roy.spi;

import com.roy.object.BenzCarService;
import com.roy.vo.ClassA;
import org.springframework.beans.factory.annotation.Autowired;

public class ferrariCar implements Car {

    private ClassA classA;

    public void setClassA (ClassA classA) {
        this.classA = classA;
    }

    @Override
    public void dragRacing(long speed) {
        System.out.println(" Ferrari is dragRacing speed:  " + speed);
    }
}
