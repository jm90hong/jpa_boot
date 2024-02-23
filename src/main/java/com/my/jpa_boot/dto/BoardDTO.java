package com.my.jpa_boot.dto;

import java.util.List;

import com.my.jpa_boot.entity.Post;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class BoardDTO {
	
	
	private Long boardIdx;
	private String title;
	private List<Post> posts;
	
	
	
}
