package com.example.demo.Archive;

import com.example.demo.Services.Ad;

import java.util.ArrayList;
import java.util.List;

public class AdContainer {

    private List ads = new ArrayList<Ad>();

    public void add (Ad ad){
        ads.add(ad);
    }

    public void remove (int adID){

        for (int i = 0; i < ads.size(); i++) {
            if (ads.get(i).equals(adID)){
                ads.remove(i);
                break;
            }
        }
    }
}

