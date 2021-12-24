package org.syh.spring.basic_di.b_constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.syh.spring.basic_di.b_constructor.bean.Tree;
import org.syh.spring.basic_di.b_constructor.config.ConstructorConfiguration;

public class InjectByConstructorApplication {
    public static void main(String[] args) {
        ApplicationContext ctxXml = new ClassPathXmlApplicationContext("basic_di/injectConstructor.xml");
        Tree treeHitotsu = ctxXml.getBean(Tree.class);
        System.out.println(treeHitotsu);

        ApplicationContext ctxAnno = new AnnotationConfigApplicationContext(ConstructorConfiguration.class);
        Tree treeFutatsu = (Tree) ctxAnno.getBean("futatsuTree");
        System.out.println(treeFutatsu);
    }
}
