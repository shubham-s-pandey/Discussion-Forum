package com.tcet.tc_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Discussion {


    @GetMapping("/")
    public String homePage() {
        return "homePage";
    }

   
}