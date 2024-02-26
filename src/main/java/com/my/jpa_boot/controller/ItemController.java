package com.my.jpa_boot.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.my.jpa_boot.entity.Item;
import com.my.jpa_boot.service.ItemService;

@RestController
@RequestMapping(value="item")
public class ItemController {

	
	@Autowired
	ItemService itemService;
	
	
	
	@GetMapping("delete")
	public String delete(
				@RequestParam(value="item_idx") Long item_idx
			) {
		
		
		itemService.delete(item_idx);
		
		return "ok";
	}
	
	@GetMapping("getByName")
	public List<Item> getByName(
				@RequestParam(value="name") String name
			){
		
		
		
		List<Item> list = itemService.findByName(name);
		
		
		return list;
		
	}
	
	
	@GetMapping("get")
	public Item get(
				@RequestParam(value="item_idx") Long itemIdx
			){
		
		Optional<Item> op = itemService.findByItemIdx(itemIdx);
		
		if(op.isEmpty()) {
			return null;
		}else {
			return op.get();
		} 
		
	}
	
	
	
	
}
