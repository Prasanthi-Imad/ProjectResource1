package com.cg.jpastart.entities;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		System.out.println("Enter id to delete: ");
		int id = scanner.nextInt();
		Student s =null;
		s = em.find(Student.class, id);
		em.getTransaction().begin();
		em.remove(s);
		em.getTransaction().commit();
		em.close();
		factory.close();
		scanner.close();
	}

}
