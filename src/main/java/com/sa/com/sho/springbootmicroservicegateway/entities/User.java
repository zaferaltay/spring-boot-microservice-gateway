package com.sa.com.sho.springbootmicroservicegateway.entities;


import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;


@Data
@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;


    @Column(name="username",unique=true,nullable=false,length=100)
    private String username;

    @Column(name="password",unique=true,nullable=false,length=100)
    private String password;

    @Column(name="name",unique=true,nullable=false,length=100)
    private String name;

    @Column(name = "creation_date")
    private LocalDateTime creationTime;


}
