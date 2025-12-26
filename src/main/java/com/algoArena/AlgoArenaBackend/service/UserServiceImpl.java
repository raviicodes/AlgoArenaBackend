package com.algoArena.AlgoArenaBackend.service;

import com.algoArena.AlgoArenaBackend.entity.User;
import com.algoArena.AlgoArenaBackend.payload.UserDTO;
import com.algoArena.AlgoArenaBackend.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    private ModelMapper modelMapper;
    @Override
    public UserDTO registerUser(UserDTO user) {
        User requestUser=new User(user.getFirstName(),user.getLastName(),user.getUserName(),user.getEmail(),user.getPassword());
User savedUser=userRepository.save(requestUser);
        return  modelMapper.map(savedUser,UserDTO.class);
    }

    @Override
    public UserDTO loginUser(UserDTO user) {
        Optional<User>savedUser=userRepository.findByEmail(user.getEmail()); if(savedUser.isPresent()) {
            User registerdUser=savedUser.get();
             return modelMapper.map(registerdUser,UserDTO.class);
        }
        else throw  new RuntimeException("user not found");
    }
}
