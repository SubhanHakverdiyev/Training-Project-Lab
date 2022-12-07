package com.example.tenniscourtbooking.Authentication;

import java.util.List;
import java.util.Optional;

import javax.inject.Inject;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;


@Controller
public class SignUpController {

    @Inject
    UserService userService;

    @GetMapping(value = "/user/{id}")
    public Optional<User> getUserById(@PathVariable("id") Long id) {
        return userService.getUserById(id);
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.getUsersList();
    }

    @GetMapping(value = "/signup")
    public String createUser(Model model) {
        SignUpRequest signUpRequest = new SignUpRequest();
        model.addAttribute("user", signUpRequest);
        return "signup";
    }

    @PostMapping("/signup/save")
    public String signup(@ModelAttribute("user") SignUpRequest signUpRequest, Model model){
        userService.saveUser(signUpRequest);
        return "redirect:/signup?success";
    }
    @GetMapping("/login")
    public String login(Model model){
        String email="";
        model.addAttribute("email", email);
        return "login";
    }

    @PostMapping("/login/save")
    public String signin(@ModelAttribute("email") String email, Model model){

        return "redirect:/signup?success";
    }
}
//curl -i -H  "Content-Type: application/json" -X  POST -d '{"name": "Xezer", "lastname" : "Haciyev", "email": "sdsdsv@gmail.com",
//"password" : "xezeer34" }' http://localhost:8080/signup