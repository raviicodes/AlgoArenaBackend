package com.algoArena.AlgoArenaBackend;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AlgoArenaBackendApplication implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(AlgoArenaBackendApplication.class, args);
	}
    @Override
    public void run(String... args) throws Exception {
        System.out.println("application started");
    }
}
