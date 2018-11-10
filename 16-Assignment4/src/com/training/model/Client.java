package com.training.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		Loan loan = new Loan();
		loan.setLoanId(118);
		loan.setCustomerName("Prasanthi");
		loan.setLoanAmount(12000);
		em.persist(loan);
		
		Repayment rp = new Repayment();
		rp.setRepaymentId(119);
		rp.setRepayAmount(4000);
		rp.setInstallmentNo(2);
		//em.persist(rp); 
		
		em.getTransaction().commit();
		em.close();
		factory.close();
		
	}
}
