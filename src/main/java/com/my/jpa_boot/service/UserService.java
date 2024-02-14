package com.my.jpa_boot.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.jpa_boot.entity.User;
import com.my.jpa_boot.repository.UserRepository;

@Service
public class UserService {

	
	@Autowired
	UserRepository userRepository;
	
	
	
	
	public User save(User user) {
		return userRepository.save( user);
	}
	
	public Optional<User> findByUserIdx(Long userIdx) {
        return userRepository.findByUserIdx(userIdx);
    }
}
