package org.syh.spring.bean.c_instantiate.config;

import org.springframework.context.annotation.Bean;
import org.syh.spring.bean.c_instantiate.bean.Car;
import org.syh.spring.bean.c_instantiate.bean.CarInstanceFactory;
import org.syh.spring.bean.c_instantiate.bean.CarStaticFactory;

public class BeanInstantiateConfiguration {
    @Bean
    public Car car2() {
        return CarStaticFactory.getCar();
    }

    @Bean
    public Car car3(CarInstanceFactory carInstanceFactory) {
        return carInstanceFactory.getCar();
    }
}
