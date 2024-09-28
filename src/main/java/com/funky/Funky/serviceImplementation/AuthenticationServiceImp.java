package com.funky.Funky.serviceImplementation;

import com.funky.Funky.config.JwtService;
import com.funky.Funky.controller.AuthenticationRequest;
import com.funky.Funky.controller.AuthenticationResponse;
import com.funky.Funky.model.RegistrationRequest;
import com.funky.Funky.model.Role;
import com.funky.Funky.model.User;
import com.funky.Funky.repository.UserRepository;
import com.funky.Funky.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class AuthenticationServiceImp implements AuthenticationService {

    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;
    @Autowired
    private UserRepository userRepository;
    @Override
    public AuthenticationResponse register(RegistrationRequest request) {
        User user = new User();
        user.setEmail(request.getEmail());
        user.setPassword(passwordEncoder.encode(request.getPassword()));
        user.setName(request.getName());
        user.setAge(request.getAge());
        user.setPhone(request.getPhone());
        user.setProfile_pic(request.getProfile_pic());
        user.setRole(Role.USER);
        user.setJoining_time(LocalDateTime.now());
        userRepository.save(user);
        var jwtToken = jwtService.generateToken(user);
        return AuthenticationResponse.builder()
                .token(jwtToken)
                .build();
    }

    @Override
    public AuthenticationResponse authenticate(AuthenticationRequest authRequest) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        authRequest.getEmail(),
                        authRequest.getPassword()
                )
        );
        var user = userRepository.findByEmail(authRequest.getEmail());
        var jwtToken = jwtService.generateToken(user);
        System.out.println("Successfully authenticated");
        return AuthenticationResponse.builder()
                .token(jwtToken)
                .build();
    }
}
