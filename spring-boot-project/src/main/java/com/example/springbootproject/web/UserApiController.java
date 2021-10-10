package com.example.springbootproject.web;

import com.example.springbootproject.web.dto.UserResponseDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserApiController {

    @PostMapping("/api/user")
    public UserResponseDto user() {
        UserResponseDto user = new UserResponseDto("이영기", "l0g@naver.com");
        return user;
    }
}
