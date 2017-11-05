package br.com.curso.cliente.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.curso.cliente.model.Cliente;

public class ClienteDao {

	private List<Cliente> mockClientes;

	public ClienteDao() {

		mockClientes = new ArrayList<>();

		mockClientes.add(new Cliente(1, "Jandeilson"));
		mockClientes.add(new Cliente(1, "pedro silva"));
		mockClientes.add(new Cliente(1, "roberto nunes"));
		mockClientes.add(new Cliente(1, "joao silva"));
		mockClientes.add(new Cliente(1, "matias alves"));

	}

	public List<Cliente> buscarCliente(String filtro) {

		List<Cliente> retorno;

		if (filtro == null || filtro.equals(""))
			retorno = mockClientes;
		else {
			retorno = new ArrayList<Cliente>();
			for (Cliente cliente : mockClientes)
				if (cliente.getNome().toUpperCase().contains(filtro.toUpperCase()))
					retorno.add(cliente);
		}

		return retorno;

	}

}
