package com.example.demo.Services;

import java.util.ArrayList;
import java.util.List;


public class AdHandler {

    private final ArrayList<Ad> ads = new ArrayList<Ad>();

    public void add (Ad ad){
        ads.add(ad);
    }

    public Ad getAdFromID(int adID) {

        for (Ad ad: ads) {
            if (ad.getAdID() == adID) {
                return ad;
            }
        }
        return null;

    }

    public void remove(int adID) {
        Ad ad = getAdFromID(adID);
        ads.remove(ad);
    }

    public List<Ad> getAds() {
        return ads;
    }

    public int getSize() {
        return ads.size();
    }
}
