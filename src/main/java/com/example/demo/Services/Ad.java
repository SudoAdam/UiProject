package com.example.demo.Services;

import java.time.LocalDate;

public class Ad {

    private String name;
    private String adresse;
    private int phoneNum;
    private LocalDate expDate;
    private String description;
    private String product;
    private int adID;

    public Ad(String name, String adresse, int phoneNum, LocalDate expDate, String description, String product, int adID) {
        this.name = name;
        this.adresse = adresse;
        this.phoneNum = phoneNum;
        this.expDate = expDate;
        this.description = description;
        this.product = product;
        this.adID = adID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public LocalDate getExpDate() {
        return expDate;
    }

    public void setExpDate(LocalDate expDate) {
        this.expDate = expDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getAdID() {
        return adID;
    }

    public void setAdID(int adID) {
        this.adID = adID;
    }

    public boolean equals(int adID) {
        boolean equals = false;
        if (this.adID == adID){
            equals = true;
        }
        return equals;
    }

    @Override
    public String toString() {
        return "Ad{" +
                "name='" + name + '\'' +
                ", adresse='" + adresse + '\'' +
                ", phoneNum=" + phoneNum +
                ", expDate=" + expDate +
                ", description='" + description + '\'' +
                ", product='" + product + '\'' +
                ", adID=" + adID +
                '}';
    }
}
