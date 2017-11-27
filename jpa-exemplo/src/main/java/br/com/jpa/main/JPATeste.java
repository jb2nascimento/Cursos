package br.com.jpa.main;

import br.com.jpa.JPAFactory;
import br.com.jpa.dao.ClienteDao;
import br.com.jpa.entity.Cliente;

public class JPATeste {

	public static void main(String[] args) {

		Cliente clienteASalvar = new Cliente();
				clienteASalvar.setIdade(30);
				clienteASalvar.setNome("Jan");
				clienteASalvar.setUltimo_nome("Nascimento");
				clienteASalvar.setUsuario("jbnascimento");
				clienteASalvar.setSenha("123");
		
		ClienteDao dao = new ClienteDao(JPAFactory.geEntity());
		dao.salvar(clienteASalvar);
		
		System.out.print("Registro Salvo");
		
	}

}
