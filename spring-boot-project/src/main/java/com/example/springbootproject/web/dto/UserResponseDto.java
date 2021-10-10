package com.example.springbootproject.web.dto;

import lombok.Getter;

@Getter
public class UserResponseDto {
    private String user;
    private String email;

    public UserResponseDto(String user, String email){
        this.user = user;
        this.email = email;
    }
}
