package com.sa.com.sho.springbootmicroservicegateway.security.jwt;

import com.sa.com.sho.springbootmicroservicegateway.entities.User;
import com.sa.com.sho.springbootmicroservicegateway.manager.IUserService;
import com.sa.com.sho.springbootmicroservicegateway.security.UserPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private IUserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userService.findByUsername(username).
                orElseThrow(()-> new UsernameNotFoundException("Username not found "+username));



        return new UserPrincipal(user.getId(),user.getUsername(),user.getPassword());
    }
}
