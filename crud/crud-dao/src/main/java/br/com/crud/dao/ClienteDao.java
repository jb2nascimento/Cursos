package br.com.crud.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.cliente.Cliente;
import br.com.crud.IClienteDao;


public class ClienteDao implements IClienteDao {

	private EntityManager gerenciaBancoDeDados;

	public ClienteDao(EntityManager entity) {
		this.gerenciaBancoDeDados = entity;
	}
	
	@SuppressWarnings("unchecked")
	public List<Cliente> selectAll() {
		Query query = this.gerenciaBancoDeDados.createQuery("select c from Cliente c");
		List<Cliente> todoOsRegistros = query.getResultList();
		return todoOsRegistros;
	}

}
