package com.banking.main.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banking.main.user.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
