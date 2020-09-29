package com.example.demo.Services;

import org.springframework.web.bind.annotation.RequestParam;

public class Createuser {

    int userID, phoneNum, streetNum, zipcode;
    String street, city, password, name ;

    public Createuser(int userID, int phoneNum, int streetNum, int zipcode, String street, String city, String password, String name) {
        this.userID = userID;
        this.phoneNum = phoneNum;
        this.streetNum = streetNum;
        this.zipcode = zipcode;
        this.street = street;
        this.city = city;
        this.password = password;
        this.name = name;
    }
}
