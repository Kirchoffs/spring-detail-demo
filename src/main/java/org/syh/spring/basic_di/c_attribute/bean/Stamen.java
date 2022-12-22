package org.syh.spring.basic_di.c_attribute.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Stamen {
    @Value("${stamen.pollen}")
    private String pollen;

    @Value("${stamen.anther}")
    private String anther;

    @Value("${stamen.filament}")
    private String filament;

    @Override
    public String toString() {
        return  "Stamen{" +
                "pollen='" + pollen + '\'' +
                ", anther='" + anther + '\'' +
                ", filament='" + filament + '\'' +
                '}';
    }
}
