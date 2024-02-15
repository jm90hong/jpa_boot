package com.my.jpa_boot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.my.jpa_boot.entity.Item;
import com.my.jpa_boot.service.ItemService;

@RestController
@RequestMapping(value="item")
public class ItemController {

	
	@Autowired
	ItemService itemService;
	
	
	
	
	
	@GetMapping("getByName")
	public Item getByName(
				@RequestParam(value="name") String name
			){
		
		
		
		List<Item> list = itemService.findByName(name);
		
		
		
		System.out.println(list.get(0));
		
		
		return list.get(0);
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
