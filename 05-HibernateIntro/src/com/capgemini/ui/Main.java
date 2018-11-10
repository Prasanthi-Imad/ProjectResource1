package com.capgemini.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.business.Employee;

public class Main {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("JPA-PU");
		EntityManager em = emf.createEntityManager();
		
		Employee e = new Employee();
		e.setEmpId(40);
		e.setEmpName("Badam");
		e.setBasicSalary(20000);
		e.setEmpGender('M');
		e.setEmpGrade('B');
		
		EntityTransaction t = em.getTransaction();
		t.begin();
		
		em.persist(e);
		t.commit();
		
		em.close();
		emf.close();
		System.out.println("Object is stored in db");
	}
}
