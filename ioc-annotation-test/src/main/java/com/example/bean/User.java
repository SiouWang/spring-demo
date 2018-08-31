package com.example.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * 使用注解将当前对象注册为Spring的一个bean
 */
@Component
public class User {

    private String userName;

    public User() {
        System.out.println("User的构造方法开始执行......");
    }

    @Autowired
    private Address address;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @PostConstruct
    public void initMethod() {
        System.out.print("User初始化方法开始执行......");
    }

    public void printAddress() {
        System.out.print(this.address.getHomeAddress());
    }
}
