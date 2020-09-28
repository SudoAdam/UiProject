package com.example.demo.Services;

import java.time.LocalDate;

public class Ad {
    private User user;
    private LocalDate expDate;
    private String description;
    private String product;

    public Ad(User user, LocalDate expDate, String description, String product) {
        this.user = user;
        this.expDate = expDate;
        this.description = description;
        this.product = product;
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
