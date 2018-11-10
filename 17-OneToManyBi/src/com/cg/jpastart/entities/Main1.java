package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main1 {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		Department dept = new Department();
		dept = em.find(Department.class, 10);
		System.out.println(dept.getName()+"\t"+dept.getEmployees().size());
		for (Employee e : dept.getEmployees()) {
			System.out.println(e.getName()+" \t"+e.getSalary());
		}
		em.close();
		factory.close();

	}

}
