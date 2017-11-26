package br.com.jpaexemplo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

@Entity
@Table(name = "tb_cliente")
@Data
@ToString
public class Cliente {

	@Id
	private int id;

	private String nome;

	private String ultimo_nome;
	
	private int idade;

	private String usuario;
	
	private String senha;
	

}
