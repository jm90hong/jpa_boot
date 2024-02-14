package com.my.jpa_boot.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;



@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
@Table(name="item")
@ToString(exclude = "user")
public class Item {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="item_idx")
	private Long itemIdx;
	
	
	@Column(name="user_idx",insertable = false, updatable = false)
	private String userIdx;
	
	
	@Column(name="name")
	private String name;
	
	
	@Column(name="created_date")
	private LocalDateTime createdDate;
	
	
	
	
	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "user_idx")
	private User user;
	
	
	
	
	
}
