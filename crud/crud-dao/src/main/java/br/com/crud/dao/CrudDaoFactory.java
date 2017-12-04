package br.com.crud.dao;

import br.com.crud.JPAFactory;
import lombok.Data;

@Data
public class CrudDaoFactory {

	private static IClienteDao clienteDao;
	
	private CrudDaoFactory() {}
	
	public static IClienteDao getInstance() {
		if(clienteDao == null) {
			clienteDao = new ClienteDao(JPAFactory.getEntity());
		}
		return clienteDao;
	}
	
}
