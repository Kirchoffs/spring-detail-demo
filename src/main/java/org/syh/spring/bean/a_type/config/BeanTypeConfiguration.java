package org.syh.spring.bean.a_type.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.syh.spring.bean.a_type.bean.Ball;
import org.syh.spring.bean.a_type.bean.Child;
import org.syh.spring.bean.a_type.bean.Toy;
import org.syh.spring.bean.a_type.bean.ToyFactoryBean;

@Configuration
public class BeanTypeConfiguration {
    @Bean
    public Toy ball() {
        return new Ball("ball");
    }

    @Bean
    public Child child() {
        return new Child();
    }

    @Bean
    public ToyFactoryBean toyFactory() {
        ToyFactoryBean toyFactory = new ToyFactoryBean();
        toyFactory.setChild(child());
        return toyFactory;
    }
}
