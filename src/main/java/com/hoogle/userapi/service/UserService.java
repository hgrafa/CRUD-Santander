package com.hoogle.userapi.service;

import com.hoogle.userapi.model.User;
import com.hoogle.userapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAll() {
        return userRepository.findAll();
    }

    public User registrateUser(User user){
        return userRepository.save(user);
    }
}
