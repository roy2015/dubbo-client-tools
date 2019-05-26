package com.roy.object;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by apple on 2019/5/26.
 */

@Service
public class AudiCarService implements CarService {
    @Autowired
    private AudiCar car;

    public AudiCar getCar() {
        return car;
    }

    public void setCar(AudiCar car) {
        this.car = car;
    }
}
