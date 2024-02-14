package com.my.jpa_boot.controller;

import java.time.LocalDateTime;
import java.util.Optional;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.my.jpa_boot.entity.User;
import com.my.jpa_boot.service.UserService;

@RestController
@RequestMapping(value="user")
public class UserController {

	
	@Autowired
	UserService userService;
	
	
	
	@GetMapping("create")
	public String create(
				@RequestParam(value="id") String id,
				@RequestParam(value="pw") String pw
			) {
		
		
		
		//빌더 함수 사용
		User user = User.builder()
						.id(id)
						.pw(DigestUtils.md5Hex(pw))
						.createdDate(LocalDateTime.now())
						.build();
		
		userService.save(user);
		
		return "ok";
	}
	
	
	@GetMapping("get")
	public User get(
				@RequestParam(value="user_idx") Long userIdx
			){
		
		Optional<User> op = userService.findByUserIdx(userIdx);
		
		if(op.isEmpty()) {
			return null;
		}else {
			return op.get();
		} 
		
	}
	
	
	
	
}
