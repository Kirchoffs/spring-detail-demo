package org.syh.spring.basic_dl.e_lazyLookup;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.syh.spring.basic_dl.e_lazyLookup.bean.Liriodendron;
import org.syh.spring.basic_dl.e_lazyLookup.bean.Michella;

public class LazyLookupApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("basic_dl/lazyLookup.xml");
        Liriodendron liriodendron = ctx.getBean(Liriodendron.class);
        System.out.println(liriodendron);
        ObjectProvider<Michella> michellaProvider = ctx.getBeanProvider(Michella.class);

        Michella michella = michellaProvider.getIfAvailable();
        if (michella == null) {
            System.out.println("Missing");
            michella = new Michella();
        }
        System.out.println(michella);

        // Michella michella = michellaProvider.getIfAvailable(() -> new Michella());
        // Michella michella = michellaProvider.getIfAvailable(Michella::new);
        // michellaProvider.ifAvailable(michella -> System.out.println(michella));
    }
}
