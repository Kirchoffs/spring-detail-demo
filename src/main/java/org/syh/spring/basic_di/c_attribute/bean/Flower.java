package org.syh.spring.basic_di.c_attribute.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Flower {
    @Value("pistil")
    private String pistil;

    @Value("stamen")
    private String stamen;

    @Value("#{petals.petal}")
    private String petal;

    @Override
    public String toString() {
        return  "Flower{" +
                "pistil='" + pistil + '\'' +
                ", stamen='" + stamen + '\'' +
                ", petal='" + petal + '\'' +
                '}';
    }
}
