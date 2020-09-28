package com.example.demo.Services;

public class User {

    private Address address;
    private Phone phone;
    private String password;

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean validatePassword (String atemptedPass){
        Boolean goodPass = false;
        if (atemptedPass == this.password){
            goodPass = true;
        }
        return goodPass;
    }

    User(Address address, Phone phone) {
        this.address = address;
        this.phone = phone;
    }

}
