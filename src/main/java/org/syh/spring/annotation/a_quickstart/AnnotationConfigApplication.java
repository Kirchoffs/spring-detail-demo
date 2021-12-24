package org.syh.spring.annotation.a_quickstart;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.syh.spring.annotation.a_quickstart.bean.Nandina;
import org.syh.spring.annotation.a_quickstart.config.QuickStartConfiguration;

public class AnnotationConfigApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(QuickStartConfiguration.class);
        Nandina nandina = ctx.getBean(Nandina.class);
        System.out.println(nandina);
    }
}
