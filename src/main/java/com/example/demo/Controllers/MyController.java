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

    @GetMapping ("/error")
    public String error (){
        return "error";
    }

}
