package com.my.jpa_boot.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

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
@Table(name="board")
public class Board extends BaseEntity{

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="board_idx", insertable = false, updatable = false)
	private Long boardIdx;
	
	
	@Column(name="title")
	private String title;
	
	@JsonManagedReference
	@OneToMany(mappedBy = "board",fetch = FetchType.LAZY)
    private List<Post> posts;
	
}
