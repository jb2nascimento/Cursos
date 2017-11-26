package br.com.jpaexemplo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

	private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("clientes");

	public static EntityManager getEntityManager() {
		return entityManagerFactory.createEntityManager();
	}

}
