package com.mekveto.vetoapp.service;

import com.mekveto.vetoapp.entity.User;

public interface IAuthenticationService {

    User signInAndReturnJWT(User signInRequest);

}
