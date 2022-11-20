package com.sa.com.sho.springbootmicroservicegateway.manager;

import com.sa.com.sho.springbootmicroservicegateway.entities.User;

public interface IAuthenticationService {
    String signInAndReturnJWT(User signInRequest);
}
