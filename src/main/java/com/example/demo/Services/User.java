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

    public String getName() {
        return name;
    }

    public void setName(PasswordAttempt passwordAttempt, String newName) {
        if (security.validate(passwordAttempt)) {
            this.name = newName;
        }
    }

    public void setPassword(PasswordAttempt passwordAttempt, String newPassword) {
        if (security.validate(passwordAttempt)) {
            security.setPassword(passwordAttempt, newPassword);
        }
    }

    public void addUserAd(PasswordAttempt passwordAttempt, Ad ad) {
        if (security.validate(passwordAttempt)) {
            userAds.add(ad);
        }
    }

    public void setPhone(PasswordAttempt passwordAttempt, int number1, int number2) {
        if (security.validate(passwordAttempt)) {
            phone.setNumbers(passwordAttempt, number1, number2);
        }
    }

    public void setAddress(PasswordAttempt passwordAttempt, String road, int number, int zip, String region) {
        if (security.validate(passwordAttempt)) {
            address.setAddress(passwordAttempt, road, number, zip, region);
        }
    }
}