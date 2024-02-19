package com.my.jpa_boot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	
	@GetMapping("log")
	public String log() {
		
		logger.info("info");
		
		return "ok";
	}
	
}


