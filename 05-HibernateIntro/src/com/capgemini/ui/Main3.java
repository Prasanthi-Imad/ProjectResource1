package com.capgemini.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capgemini.business.Employee;

public class Main3 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("JPA-PU");
		EntityManager em = emf.createEntityManager();
		Employee e = null;
		e = em.find(Employee.class, 30);
		e.setBasicSalary(30000);
		e.setEmpName("Idiot");
		e.setEmpGender('M');
		e.setEmpGrade('A');
		em.getTransaction().begin();
		em.merge(e);
		em.getTransaction().commit();
		em.close();
		emf.close();

	}

}
