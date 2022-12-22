package org.syh.spring.basic_di.d_complexField.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.syh.spring.basic_di.d_complexField.bean.Person;

@Configuration
@ComponentScan("org.syh.spring.basic_di.d_complexField.bean")
public class InjectComplexAttributeConfiguration {
    @Bean
    public Person person() {
        Person master = new Person();
        master.setName("master");
        return master;
    }
}
