package com.mekveto.vetoapp.security.jwt;

import com.mekveto.vetoapp.security.UserPrincipal;
import org.springframework.security.core.Authentication;

import javax.servlet.http.HttpServletRequest;

public interface IJwtProvider {

    String generateToken(UserPrincipal auth);
    Authentication getAuthentication(HttpServletRequest request);
    boolean validateToken(HttpServletRequest request);
}
