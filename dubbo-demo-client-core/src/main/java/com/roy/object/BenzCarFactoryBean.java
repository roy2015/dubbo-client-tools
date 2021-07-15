package com.roy.object;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * Created by apple on 2019/5/25.
 */
@Component
public class BenzCarFactoryBean implements FactoryBean<Car>, InitializingBean {
    private int factoryId;
    private int factoryName;

    private BenzCar benzCar;

    @Override
    public Car getObject() throws Exception {
        return benzCar;
    }

    @Override
    public Class<?> getObjectType() {
        return BenzCar.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

    public int getFactoryId() {
        return factoryId;
    }

    public void setFactoryId(int factoryId) {
        this.factoryId = factoryId;
    }

    public int getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(int factoryName) {
        this.factoryName = factoryName;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        benzCar = new BenzCar();
        benzCar.setName("kalr benz");
        benzCar.setPrice(900000);
        benzCar.setSpeed(300);
    }
}
