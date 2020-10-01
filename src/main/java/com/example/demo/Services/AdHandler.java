package com.example.demo.Services;

import java.util.ArrayList;


public class AdHandler {

    private ArrayList ads = new ArrayList<Ad>();

    public void add (Ad ad){
        ads.add(ad);
    }

    public ArrayList getAds() {
        return ads;
    }
}
