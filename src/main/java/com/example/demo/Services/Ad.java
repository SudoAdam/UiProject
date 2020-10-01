package com.example.demo.Services;

import java.io.Serializable;
import java.time.LocalDate;

public class Ad implements Serializable {

    private String name;
    private String adress;
    private int phoneNum;
    private LocalDate expDate;
    private String description;
    private String product;
    private int adID;

    public Ad(String name, String adress, int phoneNum, LocalDate expDate, String description, String product, int adID) {
        this.name = name;
        this.adress = adress;
        this.phoneNum = phoneNum;
        this.expDate = expDate;
        this.description = description;
        this.product = product;
        this.adID = adID;
    }

    @Override
    public String toString() {
        return "Ad{" +
                "name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", phoneNum=" + phoneNum + " <br> " +
                ", expDate=" + expDate +
                ", description='" + description + '\'' +
                ", product='" + product + '\'' +
                ", adID=" + adID +
                '}' ;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public LocalDate getExpDate() {
        return expDate;
    }

    public String getDescription() {
        return description;
    }

    public String getProduct() {
        return product;
    }

    public int getAdID() {
        return adID;
    }
}
