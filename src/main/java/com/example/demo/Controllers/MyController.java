package com.example.demo.Controllers;

import com.example.demo.Services.SystemController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

import java.time.LocalDate;

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

    @PostMapping ("/loggedIn")
    public String logedIn (@RequestParam String UserName, @RequestParam String passwordAttempt) {
        systemController.login(passwordAttempt,UserName);
        return "loggedIn";
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
    public String error (Model model){
        String names = "virk for fucking heleved!" ; //= systemController.showUser();
        model.addAttribute("users",names);  //are used to cast values into HTML
        return "error2";
    }


    @GetMapping ("/myAds")
    public String myAds (){
        return "myAds";
    }

    @GetMapping ("/Ads")
    public String Ads (){
        return "Ads";
    }

    @GetMapping ("/signAdUp")
    public String signAdUp (){
        return "signAdUp";
    }

    @PostMapping ("/createAd")
    public String createAd (
            @RequestParam String name,
            @RequestParam String adresse,
            @RequestParam int phoneNum,
            @RequestParam LocalDate expDate,
            @RequestParam String description,
            @RequestParam String product,
            Model model)

    {

        model.addAttribute("user",name);
        return "confirmation";
    }

}
