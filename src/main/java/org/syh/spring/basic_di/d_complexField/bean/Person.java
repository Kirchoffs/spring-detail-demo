package org.syh.spring.basic_di.d_complexField.bean;

import org.springframework.stereotype.Component;

@Component("administrator")
public class Person {
    private String name = "Ben";

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
