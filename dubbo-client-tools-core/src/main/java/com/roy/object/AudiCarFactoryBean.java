package com.roy.object;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * Created by apple on 2019/5/25.
 */
@Component
public class AudiCarFactoryBean implements FactoryBean<Car>, BeanFactoryPostProcessor {
    private int factoryId;
    private int factoryName;

    @Override
    public Car getObject() throws Exception {
        AudiCar audiCar = new AudiCar();
        audiCar.setName("audi");
        audiCar.setSpeed(220);
        audiCar.setPrice(200000);
        return audiCar;
    }

    @Override
    public Class<?> getObjectType() {
        return AudiCar.class;
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
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

    }
}
