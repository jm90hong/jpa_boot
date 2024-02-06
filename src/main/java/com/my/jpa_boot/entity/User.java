package com.my.jpa_boot.entity;

import java.time.LocalDateTime;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class User {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_idx")
	private Long userIdx;
	
	
	@Column(name="id")
	private String id;
	
	
	@Column(name="pw")
	private String pw;
	
	
	@Column(name="created_date")
	private LocalDateTime createdDate;
	
	
	
	
}
