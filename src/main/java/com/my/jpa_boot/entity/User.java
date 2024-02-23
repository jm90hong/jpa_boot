package com.my.jpa_boot.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Table(name="user")
public class User extends BaseEntity{
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_idx", insertable = false, updatable = false)
	private Long userIdx;
	
	
	@Column(name="id")
	private String id;
	
	
	@Column(name="pw")
	private String pw;
	
	
	
	//1 : N
	@JsonManagedReference
	@OneToMany(mappedBy = "user",fetch = FetchType.LAZY)
    private List<Item> items;

	@JsonManagedReference
	@OneToOne(mappedBy = "user",fetch = FetchType.LAZY)  
	private Post post;




	

	
	
	
	
	
	
}
