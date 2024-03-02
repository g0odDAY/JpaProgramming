package com.example.jpapractice.repository;

import com.example.jpapractice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
