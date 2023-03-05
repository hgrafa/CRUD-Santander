package com.hoogle.userapi.resources;

import com.hoogle.userapi.model.User;
import com.hoogle.userapi.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAll();
    }

    @PostMapping
    public User saveNewUser(@RequestBody User user) {
        return userService.registrateUser(user);
    }

    // verbos HTTP: GET, POST, PATCH, DELETE
}
