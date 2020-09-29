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

    public void setRoad(String password, String road) {
        if (security.validate(password)) {
            this.road = road;
        }
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String password, String region) {
        if (security.validate(password)) {
            this.region = region;
        }
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(String password, int number) {
        if (security.validate(password)) {
            this.number = number;
        }
    }

    public int getZip() {
        return zip;
    }

    public void setZip(String password, int zip) {
        if (security.validate(password)) {
            this.zip = zip;
        }
    }
}
