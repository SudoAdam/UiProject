package com.example.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    @GetMapping ("/")
    public String index (){
        return "index";
    }

    @GetMapping ("/list")
    public String list (){
        return "list";
    }

    @GetMapping ("/map")
    public String map (){
        return "map";
    }

    @GetMapping ("/logIn")
    public String logIn (){
        return "logIn";
    }

    @GetMapping ("/signUp")
    public String signUp (){ return "signUp";
    }

    @GetMapping ("/error")
    public String error (){
        return "error";
    }



    @GetMapping ("/myAds")
    public String myAds (){
        return "myAds";
    }

    @GetMapping ("/Ads")
    public String Ads (){
        return "Ads";
    }









}
