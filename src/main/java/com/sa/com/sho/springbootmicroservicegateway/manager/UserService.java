package com.sa.com.sho.springbootmicroservicegateway.manager;


import com.sa.com.sho.springbootmicroservicegateway.entities.User;
import com.sa.com.sho.springbootmicroservicegateway.repositories.IUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;


@Service
public class UserService implements  IUserService{
    @Autowired
    private IUserDao userDao;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public User saveUser(User user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setCreationTime(LocalDateTime.now());
        return userDao.save(user);
    }

    @Override
    public Optional<User> findByUsername(String username){
        return userDao.findByUsername(username);
    }

    @Override
    public List<User> findAllUsers(){
        return userDao.findAll();
    }


}
