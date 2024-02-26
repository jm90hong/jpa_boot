package com.my.jpa_boot.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.my.jpa_boot.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Long>{
	
	Optional<Item> findByItemIdx(Long itemIdx);
	

	List<Item> findByName(String name);
	
	
	
}
