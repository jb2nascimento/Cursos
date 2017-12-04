package br.com.crud.dao;

import java.util.List;

import br.com.cliente.Cliente;

public interface IClienteDao {
	
	public List<Cliente> selectAll();

}
