package com.lanou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class UserController {
    @RequestMapping(value = "/login")
    public String login(){
        System.out.println("haha");
        return  "login";
    }
}
