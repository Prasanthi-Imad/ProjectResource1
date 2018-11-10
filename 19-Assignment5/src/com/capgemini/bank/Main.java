package com.capgemini.bank;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		Bank bank1 = new Bank();
		bank1.setName("ICICI");
		bank1.setId(1004);
		bank1.setHeadOfficeLocation("Mumbai");
		
		
		Bank bank2 = new Bank();
		bank2.setName("HDFC");
		bank2.setId(1005);
		bank2.setHeadOfficeLocation("Orissa");
		
		Bank bank3 = new Bank();
		bank3.setName("SBH");
		bank3.setId(1006);
		bank3.setHeadOfficeLocation("Munnar");
		
		Customer cust1 = new Customer();
		cust1.setName("Manju");
		cust1.setId(143);
		cust1.setDob(new Date());
		bank1.addCustomer(cust1);
		
		
		Customer cust2 = new Customer();
		cust2.setName("Deep Kiran");
		cust2.setId(57);
		cust2.setDob(new Date());
		
		
		Customer cust3 = new Customer();
		cust3.setName("Veerababu");
		cust3.setId(144);
		cust3.setDob(new Date());
		
		bank1.addCustomer(cust1);
		bank2.addCustomer(cust2);
		bank3.addCustomer(cust3);
		
		em.persist(bank1);
		em.persist(bank2);
		em.persist(bank3);
		
		System.out.println("Customers added successfully");
		em.getTransaction().commit();
		em.close();
		factory.close();

	}

}
