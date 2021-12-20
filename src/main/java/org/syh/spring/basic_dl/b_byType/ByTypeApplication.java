package org.syh.spring.basic_dl.b_byType;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.syh.spring.basic_dl.b_byType.bean.Person;

public class ByTypeApplication {
    public static void main(String[] args) {
        BeanFactory factory = new ClassPathXmlApplicationContext("basic_dl/byType.xml");
        Person person = factory.getBean(Person.class);
        System.out.println(person);
    }
}
