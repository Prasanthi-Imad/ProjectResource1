package com.capgemini.bank;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {
	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		Bank bank1 = new Bank();
		bank1.setName("ICICI");
		bank1.setId(1001);
		bank1.setHeadOfficeLocation("Chennai");
		
		Bank bank2 = new Bank();
		bank2.setName("HDFC");
		bank2.setId(1002);
		bank2.setHeadOfficeLocation("Bangalore");
		
		Bank bank3 = new Bank();
		bank3.setName("SBH");
		bank3.setId(1003);
		bank3.setHeadOfficeLocation("Hyderabad");
		
		Customer cust1 = new Customer();
		cust1.setName("Akhil");
		cust1.setId(117);
		cust1.setDob(new Date());
		/*cust1.addBank(bank1);
		cust1.addBank(bank2);
		cust1.addBank(bank3);*/
		
		Customer cust2 = new Customer();
		cust2.setName("Prasanthi");
		cust2.setId(118);
		cust2.setDob(new Date());
		/*cust2.addBank(bank1);
		cust2.addBank(bank2);
		cust2.addBank(bank3);*/
		
		Customer cust3 = new Customer();
		cust3.setName("Ravi Kiran");
		cust3.setId(157);
		cust3.setDob(new Date());
		/*cust3.addBank(bank1);
		cust3.addBank(bank2);
		cust3.addBank(bank3);*/
		
		em.persist(cust1);
		em.persist(cust2);
		em.persist(cust3);
		
		System.out.println("Customers added successfully");
		em.getTransaction().commit();
		em.close();
		factory.close();
		
}
}
