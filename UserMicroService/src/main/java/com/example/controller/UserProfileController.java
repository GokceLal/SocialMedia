package com.example.controller;

import com.example.document.UserProfile;
import com.example.dto.request.CreateUserRequestDto;
import com.example.service.UserProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.example.config.RestApi.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(USERPROFILE)
public class UserProfileController {
    private final UserProfileService userProfileService;
@PostMapping(CREATE_USER)
    public ResponseEntity<Boolean> createUser(@RequestBody CreateUserRequestDto dto){
    userProfileService.createUser(dto);
    return ResponseEntity.ok(true);
 }
@GetMapping(GET_ALL)
 public ResponseEntity<List<UserProfile>> getAll()
{
    return ResponseEntity.ok(userProfileService.getAll());
}
}
