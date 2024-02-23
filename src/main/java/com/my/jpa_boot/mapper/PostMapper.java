package com.my.jpa_boot.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.my.jpa_boot.dto.PostDTO;
import com.my.jpa_boot.entity.Post;

@Mapper
public interface PostMapper extends EntityMapper<PostDTO, Post>{
	PostMapper MAPPER = Mappers.getMapper(PostMapper.class);
	
}
