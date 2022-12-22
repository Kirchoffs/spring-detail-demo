package org.syh.spring.basic_di.c_attribute.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Pistil {
    @Value("#{'stigma'}")
    private String stigma;
    private String style;
    private String ovary;
    private String ovule;

    @Override
    public String toString() {
        return  "Pistil{" +
                "stigma='" + stigma + '\'' +
                ", style='" + style + '\'' +
                ", ovary='" + ovary + '\'' +
                ", ovule='" + ovule + '\'' +
                '}';
    }
}
