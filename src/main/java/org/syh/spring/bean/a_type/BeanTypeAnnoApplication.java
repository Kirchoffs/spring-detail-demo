package org.syh.spring.bean.a_type;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.syh.spring.bean.a_type.bean.Toy;
import org.syh.spring.bean.a_type.config.BeanTypeConfiguration;

import java.util.Map;

public class BeanTypeAnnoApplication {
    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanTypeConfiguration.class);

//        Toy toy = ctx.getBean(Toy.class);
//        System.out.println(toy);

        Map<String, Toy> toys = ctx.getBeansOfType(Toy.class);
        toys.forEach((name, toy) -> {
            System.out.println("toy name : " + name + ", " + toy.toString());
        });
    }
}
