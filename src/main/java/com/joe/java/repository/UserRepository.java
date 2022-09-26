package com.joe.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joe.java.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
	UserEntity findByUserIdAndPassword(String userId, String password);
	UserEntity findByUserId(String userId);

}
