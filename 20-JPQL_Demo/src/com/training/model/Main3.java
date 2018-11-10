package com.training.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Main3 {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		Query query = em.createNamedQuery("FilterBySalaryRange");
		query.setParameter("startRange", 20000.00);
		query.setParameter("endRange", 25000.00);

		List<Person> persons = query.getResultList();
		for (Person p : persons) {
			System.out.println("\t" + p.getPersonId() + " \t" + p.getName()
					+ "\t" + p.getAge() + "\t" + p.getSalary() + "\t"
					+ p.getGender());
		}
		
		em.getTransaction().commit();
		em.close();
		factory.close();
	}

}
