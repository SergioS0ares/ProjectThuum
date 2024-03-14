package com.thuum.main.Spring.CONTROL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.thuum.main.Spring.MODEL.UserModel;
import com.thuum.main.Spring.REPOSITORY.UserRepository;

import java.util.List;
import java.util.UUID;

@Controller
public class UserController {

    @Autowired
    UserRepository userRepository;

    @PostMapping("/users")
    public @ResponseBody UserModel addUser(@RequestBody UserModel userModel) {
        userRepository.save(userModel);
        //TODO: process POST request
        return userModel;
    }

    @PutMapping("/users/{id}")
    public @ResponseBody UserModel updateUser(@PathVariable UUID id, @RequestBody UserModel userModel) {
        userModel.setIdUser(id);
        userRepository.save(userModel);
        //TODO: process PUT request
        return userModel;
    }

    @DeleteMapping("/users/{id}")
    public @ResponseBody void removeUser(@PathVariable UUID id) {
        userRepository.deleteById(id);
        //TODO: process DELETE request
    }

    @GetMapping("/users/{id}")
    public @ResponseBody UserModel getUser(@PathVariable UUID id) {
        //TODO: process GET request
        return userRepository.findById(id).orElse(null);
    }

    @GetMapping("/users")
    public @ResponseBody List<UserModel> getAllUsers() {
        //TODO: process GET request
        return userRepository.findAll();
    }
}
