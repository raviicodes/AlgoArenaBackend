package com.algoArena.AlgoArenaBackend.controller;

import com.algoArena.AlgoArenaBackend.entity.User;
import com.algoArena.AlgoArenaBackend.payload.UserDTO;
import com.algoArena.AlgoArenaBackend.service.UserService;
import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/algo-arena/")
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("/signup")
    public ResponseEntity<UserDTO> registerUser( @Valid @RequestBody UserDTO user){

          UserDTO registeredUser=userService.registerUser(user);
          return ResponseEntity.ok().body(registeredUser);
    }
    @PostMapping("/login")
    public ResponseEntity<UserDTO>loginUser(@RequestBody UserDTO user){
           UserDTO loggedInuser=userService.loginUser(user);
           return ResponseEntity.ok().body(loggedInuser);
    }
}
