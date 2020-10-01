package com.example.demo.Services;

import java.util.ArrayList;

public class User {

    private String name;
    private String userID;
    private ArrayList<Ad> userAds;
    private String password;
    // private Security security;
    private Phone phone;
    private Address address;

    public User(String name, String userID, String password, int number1, int number2, String road, int number, int zip, String region) {
        this.name = name;
        this.userID = userID;
        this.password = password;
        // this.security = new Security(password);
        this.phone = new Phone(number1, number2);
        this.address = new Address(road, number, zip, region);
    }

    public String getUserID() {
        return userID;
    }

    public String getName() {
        return name;
    }

    public Boolean validatePassword(String passwordAttempt) {
        if (passwordAttempt.equals(password)) {
            return true;
        } else {
            return false;
        }
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setPassword(String newPassword) {
        password = newPassword;
    }

    public void addAd(Ad ad) {
        userAds.add(ad);
    }

    public void setPhone(int number1, int number2) {
        phone.setNumbers(number1, number2);
    }

    public void setAddress(String road, int number, int zip, String region) {
        address.setAddress(road, number, zip, region);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", userID='" + userID + '\'' +
                ", userAds=" + userAds +
                ", password='" + password + '\'' +
                ", phone=" + phone.toString() +
                ", address=" + address.toString() +
                '}';
    }
}