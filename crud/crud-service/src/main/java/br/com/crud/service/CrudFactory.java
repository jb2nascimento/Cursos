package br.com.crud.service;

import br.com.crud.service.impl.ClienteServiceImpl;
import lombok.Data;

@Data
public class CrudFactory {

	private static IClienteService clienteService;

	private CrudFactory() {
	}

	public static IClienteService getInstance() {

		if (clienteService == null)
			clienteService = new ClienteServiceImpl();
		
		return clienteService;
	}

}
