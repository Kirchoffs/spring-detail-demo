package org.syh.spring.basic_di.c_attribute;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.syh.spring.basic_di.c_attribute.bean.Flower;
import org.syh.spring.basic_di.c_attribute.bean.Stamen;
import org.syh.spring.basic_di.c_attribute.config.InjectAttributeConfiguration;

public class InjectAttributeAnnoApplication {
    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(InjectAttributeConfiguration.class);

        Flower flower = ctx.getBean(Flower.class);
        System.out.println(flower);

        Stamen stamen = ctx.getBean(Stamen.class);
        System.out.println(stamen);


    }
}
