package br.com.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAFactory {
	
	public static EntityManager geEntity() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("clientes");
		return factory.createEntityManager();
				
	}

}
