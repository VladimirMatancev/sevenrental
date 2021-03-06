package com.sevenrental.core.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class GreetingControllerMustache {
    @GetMapping("/mustache")
    public String greeting(
            @RequestParam(name="name", required=false, defaultValue="World")
                    String name,
                    Map<String, Object> model) {
        model.put("name", name);
        return "mustache";
    }
}
