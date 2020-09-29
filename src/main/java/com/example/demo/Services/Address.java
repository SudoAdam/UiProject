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

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }
}
