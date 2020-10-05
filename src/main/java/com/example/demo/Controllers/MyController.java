package com.example.demo.Controllers;


import com.example.demo.Services.Ad;
import com.example.demo.Services.AdHandler;
import javassist.LoaderClassPath;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

import java.time.LocalDate;

@Controller
public class MyController {

    private AdHandler adHandler = new AdHandler();
    private int counter = 0;

    @Autowired
    public MyController() {

        adHandler.add(new Ad("Patrick", "Kastrupvej 54", 43787345, LocalDate.of(2020, 9, 22), "Jeg kan ikke tåle Tomater!", "Tomater", ++counter));
        adHandler.add(new Ad("Thomas", "Mågevej 2", 43787345, LocalDate.of(2020, 10, 1), "Jeg kan ikke lide æbler.", "æbler", ++counter));
        adHandler.add(new Ad("Kasper", "Pytagorasvej 87", 21985413, LocalDate.of(2020, 10, 7), "Har 4 poser jeg ikke skal bruge", "Kartoffler", ++counter));
        adHandler.add(new Ad("Adam", "Lygten 36", 21985413, LocalDate.of(2020, 10, 10), "Har købt en hel pose, skulle kun bruge 2.", "Løg", ++counter));
    }

    @GetMapping("/")
    public String index(Model model) {
        int size = adHandler.getSize();
        model.addAttribute("activeAds", size);
        model.addAttribute("totalAds", counter);
        return "index";
    }

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("ads", adHandler.getAds());
        return "list";
    }

    @GetMapping("/map")
    public String map() {
        return "map";
    }

    @GetMapping("/logIn")
    public String logIn() {
        return "logIn";
    }

    /*
    @PostMapping("/loggedIn")
    public String logedIn(@RequestParam String UserName, @RequestParam String passwordAttempt) {
        systemController.login(passwordAttempt, UserName);
        return "loggedIn";
    } */

    @GetMapping("/signUp")
    public String signUp() {
        return "signAdUp";
    }

    /*
    @PostMapping("/createUser")
    public String createUser(
            @RequestParam String name,
            @RequestParam String password,
            @RequestParam int phoneNum,
            @RequestParam String street,
            @RequestParam int streetNum,
            @RequestParam int zipcode,
            Model model) {
        systemController.createUser(name, password, phoneNum, phoneNum, street, streetNum, zipcode, "Hovedstaden");
        model.addAttribute("user", name);
        return "confirmation";
    } */

    @GetMapping("/error")
    public String error(Model model) {
        String names = "virk for fucking heleved!"; //= systemController.showUser();
        model.addAttribute("users", names);  //are used to cast values into HTML
        return "error";
    }

    /*
    @GetMapping("/myAds")
    public String myAds() {
        return "myAds";
    } */

    /*
    @GetMapping("/Ads")
    public String Ads() {
        return "Ads";
    } */

    @PostMapping("/createAd")
    public String createAd(
            @RequestParam String name,
            @RequestParam String adress,
            @RequestParam int phoneNum,
            @RequestParam String expDate,
            @RequestParam String product,
            @RequestParam String description,
            Model model) {
        LocalDate exDate = LocalDate.parse(expDate);
        Ad ad = new Ad(name, adress, phoneNum, exDate, description, product, ++counter);
        adHandler.add(ad);
        // model.addAttribute("ads", adHandler.getAds());

        return list(model);
    }

    @GetMapping("/removeAd")
    public String remove() {
        return "removeAd";
    }

    @PostMapping("/removedAd")
    public String removeAd(@RequestParam int id) {
        adHandler.remove(id);
        return "/list";
    }

    @GetMapping("/removeIfExpired")
    public String removeIfExpired(Model model) {
        adHandler.removeIfExpired(adHandler.getAds());
        adHandler.removeIfExpired(adHandler.getAds());
        return "redirect:/list";

    }
}

