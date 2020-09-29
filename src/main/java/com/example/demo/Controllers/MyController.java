package com.example.demo.Controllers;

import com.example.demo.Services.Address;
import com.example.demo.Services.Phone;
import com.example.demo.Services.Security;
import com.example.demo.Services.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;

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

    @PostMapping ("/createUser")
    public String createUser (@RequestParam String name,@RequestParam String userID,@RequestParam int phoneNum,
                        @RequestParam String street,@RequestParam int streetNum,@RequestParam String city,
                              @RequestParam int zipcode,@RequestParam String password, Model model ){
        User user = new User(name, userID, password, phoneNum, phoneNum, street, streetNum, zipcode, null);

        return "createUser";
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
