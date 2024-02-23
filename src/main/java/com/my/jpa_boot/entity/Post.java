package com.my.jpa_boot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
@Table(name="post")
public class Post extends BaseEntity{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="post_idx", insertable = false, updatable = false)
	private Long postIdx;
	
	@Column(name="board_idx")
	private Long boardIdx;
	
	@Column(name="user_idx")
	private Long userIdx;
	
	
	@Column(name="title")
	private String title;
	
	@Column(name="content")
	private String content;
}
