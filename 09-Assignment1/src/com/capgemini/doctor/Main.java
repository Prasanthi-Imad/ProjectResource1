package com.capgemini.doctor;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Main {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		//Query query = em.createQuery("from Doctor");
		em.getTransaction().begin();
		Doctor doctor = new Doctor();
		doctor.setName("Arjun");
		doctor.setFees(1500);
		Qualification qualif = new Qualification();
		qualif.setExperience(4);
		qualif.setNameOfQualification("Cardio");
		//inject qualification into doctor
		doctor.setQualification(qualif);
		
		//persist only doctor, no need to persist qualification explicitly
		em.persist(doctor);
		em.getTransaction().commit();
		
		System.out.println("Added one doctor with qualification to database.");
		
		
		
		
		em.close();
		factory.close();
	}

}
