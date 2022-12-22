package org.syh.spring.bean.b_scope.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.syh.spring.bean.b_scope.bean.Child;
import org.syh.spring.bean.b_scope.bean.Toy;

@Configuration
@ComponentScan("org.syh.spring.bean.b_scope.bean")
public class BeanScopeConfiguration {
    @Bean
    public Child child1(Toy toy) {
        Child child = new Child();
        child.setToy(toy);
        return child;
    }

    @Bean
    public Child child2(Toy toy) {
        Child child = new Child();
        child.setToy(toy);
        return child;
    }
}
