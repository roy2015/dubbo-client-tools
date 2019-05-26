package com.roy.object;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by apple on 2019/5/26.
 */

@Service
public class BenzCarService implements CarService {
    @Autowired
    private BenzCar car;

    public BenzCar getCar() {
        return car;
    }

    public void setCar(BenzCar car) {
        this.car = car;
    }
}
