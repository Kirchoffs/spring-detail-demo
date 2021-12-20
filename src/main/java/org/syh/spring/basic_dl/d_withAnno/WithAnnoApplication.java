package org.syh.spring.basic_dl.d_withAnno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.syh.spring.basic_dl.d_withAnno.anno.Brassicaceae;

import java.util.Map;

public class WithAnnoApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("basic_dl/withAnno.xml");
        Map<String, Object> beans = ctx.getBeansWithAnnotation(Brassicaceae.class);
        beans.forEach((beanName, bean) -> {
            System.out.println(beanName + " : " + bean.toString());
        });
    }
}
