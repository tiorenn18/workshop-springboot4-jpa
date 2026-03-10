package com.cursojava.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.cursojava.course.entities.User;
import com.cursojava.course.repositories.UserRepository;




@Configuration
@Profile("test")
public class Testconfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {  
        User u1 = new User(null, "Maria brown", "maria@gmail.com", "999871233", "1010");
        User u2 = new User(null, "AlexGreen", "alex@gmail.com", "999767634", "1234");

        userRepository.saveAll(Arrays.asList(u1,u2));
    }
}
