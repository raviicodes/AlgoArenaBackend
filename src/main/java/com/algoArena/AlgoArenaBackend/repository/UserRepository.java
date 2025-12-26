package com.algoArena.AlgoArenaBackend.repository;

import com.algoArena.AlgoArenaBackend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface  UserRepository extends  JpaRepository<User,Long>{
 Optional<User>findByEmail(String email);
}
