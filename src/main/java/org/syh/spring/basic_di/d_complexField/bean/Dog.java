package org.syh.spring.basic_di.d_complexField.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Dog {
    @Value("Thomas")
    private String name;

    @Autowired
    private Person administrator;

    @Override
    public String toString() {
        return  "Dog{" +
                "name='" + name + '\'' +
                ", master=" + administrator +
                '}';
    }
}
