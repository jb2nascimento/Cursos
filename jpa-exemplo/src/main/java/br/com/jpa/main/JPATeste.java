package br.com.jpa.main;

import br.com.jpa.JPAFactory;
import br.com.jpa.dao.ClienteDao;
import br.com.jpa.entity.Cliente;

public class JPATeste {

	public static void main(String[] args) {

		Cliente clienteASalvar = new Cliente();
		clienteASalvar.setIdade(44);
		clienteASalvar.setNome("Alexsandro");
		clienteASalvar.setUltimo_nome("Silva");
		clienteASalvar.setUsuario("aldsilva");
		clienteASalvar.setSenha("123456");

		System.out.println("Salvando Registro");
		
		ClienteDao dao = new ClienteDao(JPAFactory.getEntity());
		
		dao.salvar(clienteASalvar);
		
		System.out.println("Registro Salvo");

	}

}
