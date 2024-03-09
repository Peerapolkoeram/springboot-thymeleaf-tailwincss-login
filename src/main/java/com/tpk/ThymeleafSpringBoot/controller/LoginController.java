package com.tpk.ThymeleafSpringBoot.controller;

import com.tpk.ThymeleafSpringBoot.dto.LoginDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @GetMapping("/")
    public String mainLogin() {
        return "Login";
    }

    @PostMapping("/main")
    public String login(@ModelAttribute("loginForm")LoginDto data, ModelMap modelMap) {
        modelMap.addAttribute("userLogin", data);
        return "Main";
    }

}
