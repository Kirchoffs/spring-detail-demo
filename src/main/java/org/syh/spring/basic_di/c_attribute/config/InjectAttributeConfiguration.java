package org.syh.spring.basic_di.c_attribute.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.syh.spring.basic_di.c_attribute.bean")
@PropertySource("classpath:basic_di/value/stamen.properties")
public class InjectAttributeConfiguration {
}
