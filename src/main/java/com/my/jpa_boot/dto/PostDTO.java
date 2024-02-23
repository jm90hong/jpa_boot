package com.my.jpa_boot.dto;

import com.my.jpa_boot.entity.Board;
import com.my.jpa_boot.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class PostDTO {
	
	
	private Long postIdx;
	private String title;
	private String content;
	private Board board;
	private User user;
}
