package br.com.jpa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
@Table(name = "tb_cliente")
public class Cliente {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String nome;
	
	private String ultimo_nome;
	
	private int idade;
	
	private String usuario;
	
	private String senha;
	

}
