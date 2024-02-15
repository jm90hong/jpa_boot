package com.my.jpa_boot.service;

import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.jpa_boot.entity.User;
import com.my.jpa_boot.repository.UserRepository;

@Service
public class UserService {

	
	@Autowired
	UserRepository userRepository;
	
	
	
	
	
	
	
	public void delete(Long userIdx) {
		User user = User.builder()
					.userIdx(userIdx)
					.build();
		userRepository.delete(user);
	}
	
	
	//change pw
	public User updatePw(User user) {
		User entity = userRepository.findById(user.getUserIdx())
					.orElseThrow(() -> new EntityNotFoundException("Entity not found"));
		
		
		entity.setPw(user.getPw());
		
		User result = userRepository.save(entity);
		
		return result;
	}
	
	
	
	//save user
	public User save(User user) {
		return userRepository.save( user);
	}
	
	
	
	//find by idx
	public Optional<User> findByUserIdx(Long userIdx) {
        return userRepository.findByUserIdx(userIdx);
    }
}
