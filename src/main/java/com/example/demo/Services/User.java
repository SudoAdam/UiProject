package com.example.demo.Services;

public class User {

    private Address address;
    private Phone phone;
    private String password;

    User(Address address, Phone phone) {
        this.address = address;
        this.phone = phone;
    }

    public Boolean validatePassword (String attemptedPass){
        Boolean goodPass = false;
        if (attemptedPass == this.password){
            goodPass = true;
        }
        return goodPass;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
