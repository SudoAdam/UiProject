package com.example.demo.Controllers;

import com.example.demo.Services.LoggedInUser;
import com.example.demo.Services.SystemController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class MyController {

    private SystemController systemController = new SystemController();

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
    public String logIn () {
        return "logIn";
    }

    @PostMapping ("/logedIn")
    public String logedIn (@RequestParam String UserName, @RequestParam String passwordAttempt) {
       systemController.login(passwordAttempt,UserName);
        return "logedIn";
    }

    @GetMapping ("/signUp")
    public String signUp (){
        return "signUp";
    }

    @PostMapping ("/createUser")
    public String createUser (
            @RequestParam String name,
            @RequestParam String password,
            @RequestParam int phoneNum,
            @RequestParam String street,
            @RequestParam int streetNum,
            @RequestParam int zipcode,
            Model model)
    {
        systemController.createUser(name, password, phoneNum, phoneNum, street, streetNum, zipcode, "Hovedstaden");
        model.addAttribute("user",name);
        return "confirmation";
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
