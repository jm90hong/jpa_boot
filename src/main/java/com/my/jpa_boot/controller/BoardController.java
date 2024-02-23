package com.my.jpa_boot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.my.jpa_boot.dto.BoardDTO;
import com.my.jpa_boot.entity.Board;
import com.my.jpa_boot.mapper.BoardMapper;
import com.my.jpa_boot.service.BoardService;

@RestController
@RequestMapping(value="board")
public class BoardController {

	
	
	@Autowired
	BoardService boardService;
	
	
	
	
	
	@GetMapping("all")
	public List<BoardDTO> all() {
		
		List<Board> boardList = boardService.getAllBaords();
		
		System.out.println(boardList.size());
		
		List<BoardDTO> boardDTOList = new ArrayList<>();
		
		
		for (Board board : boardList) {
			BoardDTO boardDTO = BoardMapper.MAPPER.toDto(board);
		    boardDTOList.add(boardDTO); // 변환된 BoardDTO를 리스트에 추가
		}
		
		
		
		
		return boardDTOList;
	}
	
	
	
}
