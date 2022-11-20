package com.sa.com.sho.springbootmicroservicegateway.repositories;

import com.sa.com.sho.springbootmicroservicegateway.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IUserDao extends JpaRepository<User,Long> {

    Optional<User> findByUsername(String username);
}
