package br.com.beans;

import java.util.List;

import br.com.cliente.Cliente;
import br.com.crud.service.CrudFactory;
import br.com.crud.service.IClienteService;
import lombok.Data;

@Data
public class ClienteBean {

	private List<Cliente> todosOsClientes;
	
	private IClienteService clienteService;
	
	public ClienteBean() {
		
		carregarClientes();
	}
	
	public void carregarClientes() {
		
		clienteService = CrudFactory.getInstance();
		todosOsClientes = clienteService.recuperarTodosClientes();
		
	}
}
