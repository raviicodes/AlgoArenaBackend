package com.algoArena.AlgoArenaBackend.payload;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UserDTO {
    private Long userId;
    @NotBlank
    private String firstName;
    @NotBlank
    private String lastName;
    @NotBlank
    @Column(nullable = false,unique = true)
    private String userName;
    @Email
    @Column(nullable = false,unique = true)
    private String email;
    @Size(min = 6,max = 12)
    private String password;
}
