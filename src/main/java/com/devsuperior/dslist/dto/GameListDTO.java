package com.devsuperior.dslist.dto;

import org.springframework.beans.BeanUtils;

import com.devsuperior.dslist.entities.GameList;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GameListDTO {
	private Long id;
	private String name;
	
	public GameListDTO() {
		
	}
	
	public GameListDTO(GameList entity) {
		BeanUtils.copyProperties(entity, this);
		//id = entity.getId();
	}
}
