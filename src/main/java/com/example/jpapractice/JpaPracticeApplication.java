package com.example.jpapractice;

import com.example.jpapractice.model.User;
import com.example.jpapractice.repository.UserRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

@SpringBootApplication
public class JpaPracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaPracticeApplication.class, args);
    }



}
