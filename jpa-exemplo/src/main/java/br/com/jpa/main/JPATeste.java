package br.com.jpa.main;

import br.com.jpa.JPAFactory;
import br.com.jpa.dao.ClienteDao;
import br.com.jpa.entity.Cliente;

public class JPATeste {

	public static void main(String[] args) {
		
		Cliente clienteASalvar = new Cliente(0, "Lucas", "Mendes", 30, "lucasmb", "123");
		
		Cliente dao=new ClienteDao(JPAFactory.getEntity());
		
		System.out.println(x);
		
		dao.salvar(clienteASalvar);
		

	}

}
