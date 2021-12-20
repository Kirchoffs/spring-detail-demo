package org.syh.spring.basic_dl.a_byName;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.syh.spring.basic_dl.a_byName.bean.Person;

public class ByNameApplication {
    public static void main(String[] args) throws Exception {
        BeanFactory factory = new ClassPathXmlApplicationContext("basic_dl/byName.xml");
        Person person = (Person) factory.getBean("person");
        System.out.println(person);
    }
}
