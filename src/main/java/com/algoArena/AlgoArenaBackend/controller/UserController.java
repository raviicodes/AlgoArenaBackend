package com.algoArena.AlgoArenaBackend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/algo-arena/")
public class UserController {
    @GetMapping("/hello")
    public ResponseEntity<String> sayhellow(){
         return ResponseEntity.ok().body("Hi Ravikant");
    }
}
