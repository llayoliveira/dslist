package com.devsuperior.dslist.entities;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_game_list")
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class GameList {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@EqualsAndHashCode.Include
	private Long id;
	private String name;
	
	public GameList() {
	}

	public GameList(Long id, String name) {
		this.id = id;
		this.name = name;
	}
}
