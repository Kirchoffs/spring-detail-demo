package org.syh.spring.basic_di.c_attribute.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Petals {
    @Value("petal")
    private String petal;

    public String getPetal() {
        return petal;
    }

    @Override
    public String toString() {
        return  "Petals{" +
                "petal='" + petal + '\'' +
                '}';
    }
}
