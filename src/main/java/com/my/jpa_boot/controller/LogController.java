package com.my.jpa_boot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="log")
public class LogController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	
	@GetMapping("test")
	public String log() {
		
		logger.info("my info!");
		logger.warn("my warn!");
		
		return "ok";
	}
	
}


