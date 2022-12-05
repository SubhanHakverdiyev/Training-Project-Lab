package com.example.tenniscourtbooking.Authentication;

import java.util.List;
import java.util.Optional;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
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

    @PostMapping(value = "/signup")
    public void createUser(@RequestBody SignUpRequest signUpRequest) {
        userService.saveUser(signUpRequest);
    }
}
//curl -i -H  "Content-Type: application/json" -X  POST -d '{"name": "Xezer", "lastname" : "Haciyev", "email": "sdsdsv@gmail.com",
//"password" : "xezeer34" }' http://localhost:8080/signup