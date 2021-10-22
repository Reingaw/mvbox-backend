package br.com.mvbox.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.mvbox.model.User;
import br.com.mvbox.repository.UserRepository;

@RestController
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping()
    public User user(@RequestBody User user) {
        return this.userRepository.save(user);
    }

    @GetMapping("/list") 
    public List<User> List() {
        return this.userRepository.findAll();
    }
}
