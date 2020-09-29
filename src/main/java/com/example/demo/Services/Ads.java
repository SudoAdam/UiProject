package com.example.demo.Services;

import java.util.ArrayList;
import java.util.List;

public class Ads {

    private List ads = new ArrayList<Ad>();

    public void add (Ad ad){
        ads.add(ad);
    }

    public void remove (int adID){
        ads.remove(adID);
    }
}


