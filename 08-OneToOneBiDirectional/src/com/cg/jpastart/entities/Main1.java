package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main1 {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		Student student= em.find(Student.class, 6);
		System.out.println(student.getName());
		System.out.println(student.getStudentId());
		System.out.println(student.getAddress().getCity());
		em.close();
		factory.close();

	}

}
