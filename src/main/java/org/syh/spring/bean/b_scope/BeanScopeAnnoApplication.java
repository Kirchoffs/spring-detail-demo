package org.syh.spring.bean.b_scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.syh.spring.bean.b_scope.bean.Child;
import org.syh.spring.bean.b_scope.config.BeanScopeConfiguration;

public class BeanScopeAnnoApplication {
    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanScopeConfiguration.class);
        ctx.getBeansOfType(Child.class).forEach((name, child) -> {
            System.out.println(name + " : " + child);
        });
    }
}
