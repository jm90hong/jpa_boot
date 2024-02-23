package com.my.jpa_boot.mapper;




public interface EntityMapper<D,E> {

	
	E toEntity(final D dto);

	D toDto(final E entity);
}
