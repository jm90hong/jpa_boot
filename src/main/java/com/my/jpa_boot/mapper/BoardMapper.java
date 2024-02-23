package com.my.jpa_boot.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.my.jpa_boot.dto.BoardDTO;
import com.my.jpa_boot.entity.Board;


@Mapper(componentModel = "spring")
public interface BoardMapper extends EntityMapper<BoardDTO, Board> {

	
	BoardMapper MAPPER = Mappers.getMapper(BoardMapper.class);
	
	
}
