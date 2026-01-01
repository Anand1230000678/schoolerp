package com.SER.SER_app.dto;

import com.SER.SER_app.people_model.Role;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponse {
    private Long id;
    private String email;
    private String password;
    private Role role;
}
