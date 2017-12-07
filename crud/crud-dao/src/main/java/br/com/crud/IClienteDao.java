package br.com.crud;

import java.util.List;

import br.com.cliente.Cliente;

public interface IClienteDao {

	public List<Cliente> selectAll();

	public List<Cliente> selectByTermo(String termo);

	public void salvar(Cliente cliente);
	
	public void excluir(Cliente cliente);

}