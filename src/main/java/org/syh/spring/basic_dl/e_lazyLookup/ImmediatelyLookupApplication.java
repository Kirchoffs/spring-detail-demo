package org.syh.spring.basic_dl.e_lazyLookup;

import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.syh.spring.basic_dl.e_lazyLookup.bean.Liriodendron;
import org.syh.spring.basic_dl.e_lazyLookup.bean.Michella;

public class ImmediatelyLookupApplication {
    public static void main(String[] args) {
        ApplicationContext ctx;
        ctx = new ClassPathXmlApplicationContext("basic_dl/lazyLookup.xml");
        Liriodendron liriodendron = ctx.getBean(Liriodendron.class);
        System.out.println(liriodendron);

        Michella michella;
        try {
            michella = ctx.getBean(Michella.class);
        } catch (NoSuchBeanDefinitionException exp) {
            exp.printStackTrace();
            michella = new Michella();
        }
        System.out.println(michella);
    }
}
