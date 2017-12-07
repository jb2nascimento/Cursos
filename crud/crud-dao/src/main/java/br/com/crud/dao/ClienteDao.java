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

	@SuppressWarnings("unchecked")
	public List<Cliente> selectByTermo(String termo) {

		Query query = this.gerenciaBancoDeDados.createQuery("select c from Cliente c where c.nome LIKE lower(:nome)");

		query.setParameter("nome", "%" + termo + "%");

		List<Cliente> todoOsRegistros = query.getResultList();
		return todoOsRegistros;
	}

	public void salvar(Cliente cliente) {

		try {
			gerenciaBancoDeDados.getTransaction().begin();

			if (cliente.getId() != null)
				gerenciaBancoDeDados.merge(cliente);
			else
				gerenciaBancoDeDados.persist(cliente);

			gerenciaBancoDeDados.getTransaction().commit();
		} catch (Exception e) {
			gerenciaBancoDeDados.getTransaction().rollback();
		}

	}
	

	public void excluir(Cliente cliente) {

		try {
			gerenciaBancoDeDados.getTransaction().begin();

			if (cliente.getId() != null)
				gerenciaBancoDeDados.remove(cliente);
			else
				gerenciaBancoDeDados.persist(cliente);

			gerenciaBancoDeDados.getTransaction().commit();
		} catch (Exception e) {
			gerenciaBancoDeDados.getTransaction().rollback();
		}
		
	}

}
