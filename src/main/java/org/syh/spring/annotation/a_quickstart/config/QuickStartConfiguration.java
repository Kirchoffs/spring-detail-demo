package org.syh.spring.annotation.a_quickstart.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.syh.spring.annotation.a_quickstart.bean.Nandina;

@Configuration
public class QuickStartConfiguration {
    @Bean(name = "nandinaHitotsu")
    public Nandina nandina() {
        return new Nandina();
    }
}
