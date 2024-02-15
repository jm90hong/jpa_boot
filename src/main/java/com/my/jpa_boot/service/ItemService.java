package com.my.jpa_boot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.jpa_boot.entity.Item;
import com.my.jpa_boot.repository.ItemRepository;

@Service
public class ItemService {

	@Autowired
	ItemRepository itemRepository;
	
	
	
	
	public List<Item> findByName(String name) {
		return itemRepository.findByName(name);
	}
	
	public Item save(Item item) {
		return itemRepository.save(item);
	}	
	
	
	public Optional<Item> findByItemIdx(Long itemIdx) {
        return itemRepository.findByItemIdx(itemIdx);
    }
}
