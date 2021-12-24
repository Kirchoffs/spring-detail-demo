package org.syh.spring.basic_di.a_setter;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.syh.spring.basic_di.a_setter.bean.Cat;
import org.syh.spring.basic_di.a_setter.bean.Person;

public class InjectBySetterXmlApplication {
    public static void main(String[] args) throws Exception {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("basic_di/injectSetter.xml");
        Person person = beanFactory.getBean(Person.class);
        System.out.println(person);

        Cat cat = beanFactory.getBean(Cat.class);
        System.out.println(cat);
    }
}
