package br.com.jpa.main;

import br.com.jpa.JPAFactory;
import br.com.jpa.dao.ClienteDao;
import br.com.jpa.entity.Cliente;

public class JPATeste {

	public static void main(String[] args) {
<<<<<<< HEAD
		
		Cliente clienteASalvar = new Cliente(0, "Lucas", "Mendes", 30, "lucasmb", "123");
		
		Cliente dao=new ClienteDao(JPAFactory.getEntity());
		
		System.out.println(x);
		
		dao.salvar(clienteASalvar);
		

	}

}
=======

		Cliente clienteASalvar = new Cliente();
		clienteASalvar.setId(0);
		clienteASalvar.setIdade(30);
		clienteASalvar.setNome("Ismael");
		clienteASalvar.setUltimo_nome("Xavier");
		clienteASalvar.setUsuario("ismael");
		clienteASalvar.setSenha("123");

		System.out.println("Salvando Registro");
		
		ClienteDao dao = new ClienteDao(JPAFactory.getEntity());
		
		dao.salvar(clienteASalvar);
		
		System.out.println("Registro Salvo");

	}

}









>>>>>>> branch 'master' of https://github.com/jb2nascimento/Cursos.git
