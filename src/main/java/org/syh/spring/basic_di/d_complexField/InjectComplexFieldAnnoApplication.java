package org.syh.spring.basic_di.d_complexField;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.syh.spring.basic_di.d_complexField.bean.Dog;
import org.syh.spring.basic_di.d_complexField.config.InjectComplexAttributeConfiguration;

public class InjectComplexFieldAnnoApplication {
    public static void main(String[] args) {
        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(InjectComplexAttributeConfiguration.class);
        Dog dog = ctx.getBean(Dog.class);
        System.out.println(dog);
    }
}
