package com.example.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

/**
 * 自定义类，实现BeanDefinitionRegistryPostProcessor
 * 用于实现自定义处理BeanDefinition
 */
@Component
public class BeanDefinitionRegistryPostProcessorImpl implements BeanDefinitionRegistryPostProcessor {

    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry beanDefinitionRegistry) throws BeansException {
        String[] beanDefinitionNames = beanDefinitionRegistry.getBeanDefinitionNames();
        for(String beanDefinitionName : beanDefinitionNames) {
            if("user".equals(beanDefinitionName)) {
                BeanDefinition beanDefinition = beanDefinitionRegistry.getBeanDefinition(beanDefinitionName);
                String[] depends = beanDefinition.getDependsOn();
                if(depends != null && depends.length > 0) {
                    for(String dependName : depends) {
                        System.out.print("user dependName = " + dependName);
                    }
                }
            }



        }
        System.out.println("postProcessBeanDefinitionRegistry方法执行...");
    }

    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        System.out.println("postProcessBeanFactory方法执行...");
    }
}
