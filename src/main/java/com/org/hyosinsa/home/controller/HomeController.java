package com.org.hyosinsa.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    
    @GetMapping("/")
    public String home(){
        System.out.println("하ㅓㅏ하하하하하하");
        return "home";
    }

    @GetMapping("/hello")
    public String hello(){
        System.out.println("fdsanfkjsdahf;sadhkj");
        return "hello";
    }
}
