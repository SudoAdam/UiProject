package com.example.demo.Services;

import java.time.LocalDate;

public class Ad {
    private User user;
    private LocalDate expDate;
    private String description;
    private String product;
    private int adID;

    public Ad(User user, LocalDate expDate, String description, String product, int adID) {
        this.user = user;
        this.expDate = expDate;
        this.description = description;
        this.product = product;
        this.adID = adID;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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
                "user=" + user +
                ", expDate=" + expDate +
                ", description='" + description + '\'' +
                ", product=" + product +
                '}';
    }
}
