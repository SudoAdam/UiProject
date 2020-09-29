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

}
