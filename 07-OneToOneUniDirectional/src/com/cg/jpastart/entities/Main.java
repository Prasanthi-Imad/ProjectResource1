package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		Address address = null;
		address = em.find(Address.class, 1);
		//address.getCity();
		System.out.println(address.getState()+"\n "+ address.getCity()+ "\n " +address.getStreet()+ "\n "+address.getZipCode());
		Student student =em.find(Student.class, 7);
		System.out.println(student.getName()+" \t " +student.getAddress().getCity()+ "\t "+student.getAddress().getZipCode());
		
		em.close();
		factory.close();
	}

}
