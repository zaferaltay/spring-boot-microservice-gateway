package com.sa.com.sho.springbootmicroservicegateway.security.jwt;

import com.sa.com.sho.springbootmicroservicegateway.security.UserPrincipal;
import org.springframework.security.core.Authentication;

import javax.servlet.http.HttpServletRequest;

public interface IJwtProvider {

    String generateToken(UserPrincipal authentication);

    Authentication getAuthentication(HttpServletRequest request);

    boolean isTokenValid(HttpServletRequest request);
}
