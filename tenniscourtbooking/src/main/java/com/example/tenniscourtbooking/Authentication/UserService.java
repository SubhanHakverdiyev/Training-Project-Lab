package com.example.tenniscourtbooking.Authentication;

import java.util.List;
import java.util.Optional;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Inject
    UserRepository userRepo;


    public void saveUser(SignUpRequest signUpRequest) {
        User user = new User();
        user.setFirstName(signUpRequest.getName());
        user.setLastName(signUpRequest.getLastname());
        user.setPassword(signUpRequest.getPassword());
        user.setEmail(signUpRequest.getEmail());

        userRepo.save(user);
    }

    public List<User> getUsersList() {
        return userRepo.findAll();
    }

    public Optional<User> getUserById(Long id) {
        return userRepo.findById(id);
    }

}
