package com.mekveto.vetoapp.service;

import com.mekveto.vetoapp.entity.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public interface IUserService {
    User saveUser(User user);

    Optional<User> findByUsername(String username);

    @Transactional
    void makeAdmin(String username);

    Object saveUser(org.springframework.security.core.userdetails.User user);
}
