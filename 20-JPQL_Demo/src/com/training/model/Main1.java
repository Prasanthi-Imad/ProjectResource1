package com.training.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Main1 {

	public static void main(String[] args) {
		String JPQL = "from Person";
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		Query query = em.createQuery(JPQL);
		List<Person> persons = query.getResultList();
		for (Person p : persons) {
			System.out.println("\t"+p.getPersonId()+ " \t"+p.getName());
		}
		
		
		
		em.getTransaction().commit();
		em.close();
		factory.close();
	}

}
