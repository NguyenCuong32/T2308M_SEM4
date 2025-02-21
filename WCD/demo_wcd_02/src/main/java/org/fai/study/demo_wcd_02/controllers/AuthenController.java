package org.fai.study.demo_wcd_02.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/authen")
public class AuthenController {
    public AuthenController() {}
    @GetMapping("/login")
    public String Login(){
        return "authens/login";
    }
    public String AccessDenied(){
        return "authens/accessDenied";
    }
}
