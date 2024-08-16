package com.example.service;

import com.example.dto.request.LoginResponseDto;
import com.example.dto.request.RegisterRequestDto;
import com.example.entity.Auth;
import com.example.repository.AuthRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final AuthRepository authRepository;

    public Auth register(RegisterRequestDto dto) {
        return authRepository.save(Auth.builder()
                .username(dto.getUserName())
                .password(dto.getPassword())
                .email(dto.getEmail())
                .build());

    }

    public Boolean login(LoginResponseDto dto) {
        return authRepository.existsByUsernameAndPassword(dto.getUsername(), dto.getPassword());
    }
}
