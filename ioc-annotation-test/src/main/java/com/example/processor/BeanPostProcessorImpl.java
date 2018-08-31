package com.example.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class BeanPostProcessorImpl implements BeanPostProcessor {

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if("user".equals(beanName)) {
            System.out.println("user开始调用初始化方法了......");
        }
        return null;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if("user".equals(beanName)) {
            System.out.println("user已经调用初始化方法了......");
        }
        return null;
    }
}
