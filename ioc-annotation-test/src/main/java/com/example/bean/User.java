package com.example.bean;

import org.springframework.stereotype.Component;

/**
 * 使用注解将当前对象注册为Spring的一个bean
 */
@Component
public class User {

    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
