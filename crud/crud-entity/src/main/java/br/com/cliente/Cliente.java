package br.com.cliente;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Data
@Entity
@Table(name = "tb_cliente")
@AllArgsConstructor
public class Cliente {

	@Getter
	@Setter
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Getter
	@Setter
	private String nome;

	@Getter
	@Setter
	private String ultimo_nome;

	@Getter
	@Setter
	private int idade;

	@Getter
	@Setter
	private String usuario;

	@Getter
	@Setter
	private String senha;

}
