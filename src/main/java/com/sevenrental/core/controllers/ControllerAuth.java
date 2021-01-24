package com.sevenrental.core.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/auth")
public class ControllerAuth {
    @GetMapping("/login")
    public String getLogin(){
        return "login";
    }
    @GetMapping("/success")
    public String getSuccess(){
        return "success";
    }
}
