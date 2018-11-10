package com.cg.jpastart.entities;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
public class Main2 {

	public static void main(String[] args) {
		List<Student> studentList = null;
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		Query query = em.createQuery("from Student");
		studentList = query.getResultList();
		for(Student student : studentList){
			System.out.println(student.getName().toUpperCase());
			em.getTransaction().begin();
			em.merge(student);
			
			student.setName(student.getName().toUpperCase());
			em.getTransaction().commit();
		}
		em.close();
		factory.close();
	}

}
