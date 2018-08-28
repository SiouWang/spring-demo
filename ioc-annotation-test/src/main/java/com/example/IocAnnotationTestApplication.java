package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IocAnnotationTestApplication {

    public static void main(String args[]) {
        // 使用基于注解的IOC容器
        ApplicationContext context = new AnnotationConfigApplicationContext("com.example.*");
        // 获取IOC容器内的所有BeanDefinition
        String[] beanNames = context.getBeanDefinitionNames();
        for(String str : beanNames) {
            System.out.println("当前容器中的bean有：" + str);
        }

    }

}
