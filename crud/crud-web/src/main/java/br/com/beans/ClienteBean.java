package br.com.beans;

import java.util.List;

import org.apache.commons.lang.StringUtils;

import br.com.cliente.Cliente;
import br.com.crud.service.CrudFactory;
import br.com.crud.service.IClienteService;
import lombok.Data;

@Data
public class ClienteBean {

	private List<Cliente> todosOsClientes;

	private IClienteService clienteService;

	private String termoPesquisa;

	public ClienteBean() {
		carregarClientes();
	}

	public void carregarClientes() {
		clienteService = CrudFactory.getInstance();
		todosOsClientes = clienteService.recuperarTodosClientes();
	}

	public String pesquisarClientes() {

		if (StringUtils.isNotEmpty(this.termoPesquisa)) {
			clienteService = CrudFactory.getInstance();
			todosOsClientes = clienteService.filtrarClientes(termoPesquisa);
		}

		return "index";

	}

}
