package com.sda.spring.core.configs.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoScope {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(ScopeConfig.class);
    }

    private static void createSingletonService(ApplicationContext context) {
        SingletonService service1 = context.getBean("singletonService", SingletonService.class);
        SingletonService service2 = context.getBean("singletonService", SingletonService.class);
        System.out.println(service1);
        System.out.println(service2);

    }

    private static void createPrototypeService(ApplicationContext context) {
        PrototypeService service1 = context.getBean("prototypeService", PrototypeService.class);
        PrototypeService service2 = context.getBean("prototypeService", PrototypeService.class);
        System.out.println(service1);
        System.out.println(service2);
    }


}
