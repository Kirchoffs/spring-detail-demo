package org.syh.spring.basic_di.b_constructor.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.syh.spring.basic_di.b_constructor.bean.Tree;

@Configuration
public class ConstructorConfiguration {
    @Bean(name = "futatsuTree")
    public Tree tree() {
        return new Tree("spruces", "yellow");
    }
}
