package com.naumov.social.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SocialController {
    @GetMapping("/")
    public String getIndex(){
        return "index";
    }
}
