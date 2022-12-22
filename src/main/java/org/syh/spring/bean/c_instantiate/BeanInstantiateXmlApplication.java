package org.syh.spring.bean.c_instantiate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.syh.spring.bean.c_instantiate.bean.Car;

public class BeanInstantiateXmlApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean/bean-instantiate.xml");
        ctx.getBeansOfType(Car.class).forEach((beanName, car) -> {
            System.out.println(beanName + ": " + car);
        });
    }
}
