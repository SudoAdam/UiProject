package com.example.demo.Services;

import java.util.ArrayList;

public class User {

    private String name;
    private String userID;
    private ArrayList<Ad> userAds;
    private Security security;
    private Phone phone;
    private Address address;

    User(String name, String userID, String password, int number1, int number2, String road, int number, int zip, String region) {
        this.name = name;
        this.userID = userID;
        this.security = new Security(password);
        this.phone = new Phone(security, number1, number2);
        this.address = new Address(security, road, number, zip, region);
    }
    public String getUserID() {
        return userID;
    }

    public void setName(Password password, String newName) {
        if (security.validate(password)) {
            this.name = newName;
        }
    }

    public void setPassword(Password password, String newPassword) {
        if (security.validate(password)) {
            security.setPassword(password, newPassword);
        }
    }

    public void addUserAd(Password password, Ad ad) {
        if (security.validate(password)) {
            userAds.add(ad);
        }
    }

    public void setPhone(Password password, int number1, int number2) {
        if (security.validate(password)) {
            phone.setNumbers(password, number1, number2);
        }
    }

    public void setAddress(Password password, String road, int number, int zip, String region) {
        if (security.validate(password)) {
            address.setAddress(password, road, number, zip, region);
        }
    }
}