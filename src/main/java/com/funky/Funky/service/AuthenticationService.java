package com.funky.Funky.service;

import com.funky.Funky.controller.AuthenticationRequest;
import com.funky.Funky.controller.AuthenticationResponse;
import com.funky.Funky.model.RegistrationRequest;
import com.funky.Funky.model.User;

public interface AuthenticationService {
    AuthenticationResponse register(RegistrationRequest request);

    AuthenticationResponse authenticate(AuthenticationRequest authRequest);
}
