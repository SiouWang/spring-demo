package com.example.bean;

import org.springframework.stereotype.Component;

@Component
public class Address {

    private String homeAddress = "中国钓鱼岛";

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }
}
