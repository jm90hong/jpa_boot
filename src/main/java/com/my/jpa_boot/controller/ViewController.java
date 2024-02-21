package com.my.jpa_boot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.my.jpa_boot.entity.User;

@Controller
public class ViewController {

	
	@GetMapping("")
	public String home(Model model) {
		
		
		
		//Entity -> Model
		User user =  User.builder().id("coding1422").pw("1234").build();
		model.addAttribute("user",user);
		
		
		//List<Entity> -> Model
		User user1 =  User.builder().id("user1").pw("1111").build();
		User user2 =  User.builder().id("user2").pw("2222").build();
		User user3 =  User.builder().id("user3").pw("3333").build();
		
		List<User> userList = new ArrayList<>() {
		    {
		        add(user1);
		        add(user2);
		        add(user3);
		    }
		};
		model.addAttribute("users",userList);
		
		
		return "home";
	}
	
}
