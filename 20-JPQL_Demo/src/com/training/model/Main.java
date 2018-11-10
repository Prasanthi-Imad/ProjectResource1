package com.training.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		Person p1 = new Person("Prasanthi", 21, 20000, 'F');
		Person p2 = new Person("Ravi Kiran", 22, 22500, 'M');
		Person p3 = new Person("Akhil Kiran", 21, 16000, 'M');
		Person p4 = new Person("Chaitanya", 23, 25000, 'M');
		Person p5 = new Person("Kavya", 22, 18000, 'F');
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.persist(p4);
		em.persist(p5);
		
		em.getTransaction().commit();
		em.close();
		factory.close();
	}

}
