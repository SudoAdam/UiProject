package com.example.demo.Services;

public class Address {
    // Validate address info from Google?
    private Security security;
    private String road, region;
    private int number, zip;

    Address(Security security, String road, int number, int zip, String region) {
        this.security = security;
        this.road = road;
        this.number = number;
        this.zip = zip;
        this.region = region;
    }

    public String getRoad() {
        return road;
    }

    public String getRegion() {
        return region;
    }

    public int getNumber() {
        return number;
    }

    public int getZip() {
        return zip;
    }

    public void setAddress(String password, String road, int number, int zip, String region) {
        if (security.validate(password)) {
            this.road = road;
            this.number = number;
            this.zip = zip;
            this.region = region;
        }
    }
}
