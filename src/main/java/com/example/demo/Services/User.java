package com.example.demo.Services;

public class User {

    private String name;
    private Security security;
    private Phone phone;
    private Address address;

    User(String name, String password, int number1, int number2, String road, int number, int zip, String region) {
        this.name = name;
        this.security = new Security(password);
        this.phone = new Phone(security, number1, number2);
        this.address = new Address(security, road, number, zip, region);
    }

    public void setName(String password, String newName) {
        if (security.validate(password)) {
            this.name = newName;
        }
    }

    public void setPassword(String password, String newPassword) {
        if (security.validate(password)) {
            security.setPassword(password, newPassword);
        }
    }

    public void setPhone(String password, int number1, int number2) {
        if (security.validate(password)) {
            phone.setNumbers(password, number1, number2);
        }
    }

    public void setAddress(String password, String road, int number, int zip, String region) {
        if (security.validate(password)) {
            address.setAddress(password, road, number, zip, region);
        }
    }
}