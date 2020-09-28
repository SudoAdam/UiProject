package com.example.demo.Services;

public class Address {
    // Validate address info from Google?

    private String road, region;
    private int number, zip;

    Address(String road, int number, int zip, String region) {
        this.road = road;
        this.number = number;
        this.zip = zip;
        this.region = region;
    }

}
