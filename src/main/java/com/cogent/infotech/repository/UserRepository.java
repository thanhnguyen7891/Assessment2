package com.cogent.infotech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cogent.infotech.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	User findByUserName(String username);
}
