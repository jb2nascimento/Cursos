package br.com.crud.service.impl;

import java.util.List;

import br.com.cliente.Cliente;
import br.com.crud.CrudDaoFactory;
import br.com.crud.IClienteDao;
import br.com.crud.service.IClienteService;

public class ClienteServiceImpl implements IClienteService {

	public List<Cliente> recuperarTodosClientes() {

		IClienteDao daoService = CrudDaoFactory.getInstance();
		return daoService.selectAll();

	}

}
