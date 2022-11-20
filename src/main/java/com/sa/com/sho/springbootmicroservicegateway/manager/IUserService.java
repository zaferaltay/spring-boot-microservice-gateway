package com.sa.com.sho.springbootmicroservicegateway.manager;

import com.sa.com.sho.springbootmicroservicegateway.entities.User;

import java.util.List;
import java.util.Optional;

public interface IUserService {

    User saveUser(User user);
    Optional<User> findByUsername(String username);
    List<User> findAllUsers();
}
