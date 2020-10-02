package com.example.demo.Services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class AdHandler {

    private final ArrayList<Ad> ads = new ArrayList<Ad>();
    private int counter = 0;

    public void create(String name, String address, int phoneNum, String expDate, String description, String product) {
        LocalDate exDate = LocalDate.parse(expDate);
        Ad ad = new Ad(name, address, phoneNum, exDate, description, product, counter);
        counter++;
        ads.add(ad);
    }

    public Ad getAdByID(int adID) {

        for (Ad ad: ads) {
            if (ad.getAdID() == adID) {
                return ad;
            }
        }

        return null;
    }

    public List<Ad> getAds() {
        return ads;
    }

    public void add (Ad ad){
        ads.add(ad);
    }

    public void remove(int adID) {
        Ad ad = getAdByID(adID);
        ads.remove(ad);
    }

}
