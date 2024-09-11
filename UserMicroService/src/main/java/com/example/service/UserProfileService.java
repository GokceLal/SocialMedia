package com.example.service;

import com.example.document.UserProfile;
import com.example.dto.request.CreateUserRequestDto;
import com.example.repository.UserProfileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserProfileService {
    private final UserProfileRepository repository;
    private final CacheManager cacheManager;

    public void createUser(CreateUserRequestDto dto) {
        repository.save(UserProfile.builder()
                .authId(dto.getAuthId())
                .userName(dto.getUsername())
                .email(dto.getEmail())
                .build());
    }

    public List<UserProfile> getAll() {
        return repository.findAll();
    }
@Cacheable("upper-case")
    public String upperName(String name) {
        String result = name.toUpperCase();

        return result;
    }
    public void clearCache() {
        cacheManager.getCache("upper-case").clear();
    }
}
