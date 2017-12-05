package br.com.crud.service;

import java.util.List;

import br.com.cliente.Cliente;

public interface IClienteService {

	
	public List<Cliente> recuperarTodosClientes();
	
	
	public List<Cliente> filtrarClientes(String termo);
	

}
