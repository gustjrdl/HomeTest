package com.example.home.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("")
@Controller
public class MainController {

    @GetMapping
    public String mainView(){
        return "main";
    }
}
