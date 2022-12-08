package com.example.tenniscourtbooking;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tenniscourtbooking.Authentication.SignUpRequest;

@Controller

public class WebAppController {

    @GetMapping("/index")
    public String showHomePage() {
        return "index";
    }

    @GetMapping("/payment")
    public String getPayment () { return "payment"; }

}
