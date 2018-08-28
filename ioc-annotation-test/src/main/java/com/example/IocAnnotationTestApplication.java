package com.example;

import com.example.bean.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IocAnnotationTestApplication {

    public static void main(String args[]) {

        System.out.println("=======================================================================");

        usingAnnotatedClasses();


    }

    /**
     * 使用带注解的Bean来作为容器参数启动
     */
    public static void usingAnnotatedClasses() {
        ApplicationContext context = new AnnotationConfigApplicationContext(User.class);
        // 获取IOC容器内的所有BeanDefinition
        String[] beanNames = context.getBeanDefinitionNames();
        for(String str : beanNames) {
            System.out.println("当前容器中的bean有：" + str);
        }
    }

    /**
     * 使用包路径作为容器参数来启动
     */
    public static void usingBasePackages() {
        // 使用基于注解的IOC容器
        ApplicationContext context = new AnnotationConfigApplicationContext("com.example.*");
        // 获取IOC容器内的所有BeanDefinition
        String[] beanNames = context.getBeanDefinitionNames();
        for(String str : beanNames) {
            System.out.println("当前容器中的bean有：" + str);
        }
    }

}
