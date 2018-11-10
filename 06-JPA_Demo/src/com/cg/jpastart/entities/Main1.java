package com.cg.jpastart.entities;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main1 {
public static void main(String[] args) {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
	EntityManager em = factory.createEntityManager();
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter id to fetch details: ");
	int id = scanner.nextInt();
	Student s = null;
	s = em.find(Student.class, id);
	System.out.println(s);
	
	em.close();
	factory.close();
	scanner.close();
}
}
