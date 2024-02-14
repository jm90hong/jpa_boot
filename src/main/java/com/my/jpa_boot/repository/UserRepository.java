package com.my.jpa_boot.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.my.jpa_boot.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	
	Optional<User> findByUserIdx(Long userIdx);
}
