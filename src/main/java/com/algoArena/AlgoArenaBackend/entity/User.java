package com.algoArena.AlgoArenaBackend.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@Data
@NoArgsConstructor
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(
            name = "user_seq_gen",
            sequenceName = "user_seq",
            allocationSize = 50
    )
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

    public User(@NotBlank String firstName, @NotBlank String lastName, @NotBlank String userName, @Email String email, @Size(min = 6,max = 12) String password) {
        this.userName=userName;
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
        this.password=password;
    }
}
