package com.my.jpa_boot.entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Table(name="user")

public class User {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_idx", insertable = false, updatable = false)
	private Long userIdx;
	
	
	@Column(name="id")
	private String id;
	
	
	@Column(name="pw")
	private String pw;
	
	
	
	@Column(name="created_date")
	private LocalDateTime createdDate;
	
	
	//1 : N
	@OneToMany(mappedBy = "user",fetch = FetchType.LAZY)
    private List<Item> items;

	
	
	
	
	
	
}
