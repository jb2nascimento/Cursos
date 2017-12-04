package br.com.crud;

import br.com.crud.dao.ClienteDao;
import lombok.Data;

@Data
public class CrudDaoFactory {

	private static IClienteDao clienteDao;

	private CrudDaoFactory() {
	}

	public static IClienteDao getInstance() {
		if (clienteDao == null) {
			clienteDao = new ClienteDao(JPAFactory.getEntity());
		}
		return clienteDao;
	}

}
