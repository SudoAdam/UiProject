package com.example.demo.Services;

import java.util.ArrayList;
import java.util.List;


public class AdHandler {

    private final ArrayList<Ad> ads = new ArrayList<Ad>();

    public void add (Ad ad){
        ads.add(ad);
    }

    public List<Ad> getAds() {
        return ads;
    }
}
