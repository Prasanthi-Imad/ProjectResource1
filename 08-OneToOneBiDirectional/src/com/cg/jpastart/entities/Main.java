package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		Address address = em.find(Address.class, 2);
		System.out.println(address.getCity());
		System.out.println(address.getStudent().getName());
		em.close();
		factory.close();
	}

}
