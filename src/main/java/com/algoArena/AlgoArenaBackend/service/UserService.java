package com.algoArena.AlgoArenaBackend.service;
import com.algoArena.AlgoArenaBackend.payload.UserDTO;

public interface UserService {
    UserDTO registerUser(UserDTO user);
    UserDTO loginUser(UserDTO user);
}
