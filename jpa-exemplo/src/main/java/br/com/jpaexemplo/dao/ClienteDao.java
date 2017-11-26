package br.com.jpaexemplo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.jpaexemplo.entity.Cliente;

public class ClienteDao {

	private EntityManager entity;

	public ClienteDao(EntityManager entity) {
		this.entity = entity;
	}

	public Cliente getById(int id) {
		return entity.find(Cliente.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Cliente> getAll() {
		Query query = entity.createQuery("select s from Cliente s");
		return query.getResultList();
	}

	public void salvar(Cliente cliente) {
		try {
			entity.getTransaction().begin();
			entity.persist(cliente);
			entity.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			entity.getTransaction().rollback();
		}
	}

	public void update(Cliente cliente) {
		try {
			entity.getTransaction().begin();
			entity.merge(cliente);
			entity.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			entity.getTransaction().rollback();
		}
	}

	public void remove(Cliente cliente) {
		try {
			entity.getTransaction().begin();
			cliente = entity.find(Cliente.class, cliente.getId());
			entity.remove(cliente);
			entity.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			entity.getTransaction().rollback();
		}
	}

}
