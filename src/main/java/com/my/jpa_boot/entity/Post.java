package com.my.jpa_boot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

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
	
	
	@Column(name="title")
	private String title;
	
	@Column(name="content")
	private String content;
	
	@ManyToOne()
	@JsonBackReference
	@JoinColumn(name="board_idx")
	private Board board;
	
	
	@OneToOne()
	@JsonBackReference
	@JoinColumn(name="user_idx")
    private User user;
	
}
//https://unluckyjung.github.io/dev/2021/11/20/Dto-Entity-Mapper/
