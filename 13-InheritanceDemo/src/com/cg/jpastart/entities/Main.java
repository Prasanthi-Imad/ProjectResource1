package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		Employee emp = null;
		emp = em.find(Employee.class,3);
		System.out.println(emp);
		System.out.println(emp instanceof Employee);
		System.out.println(emp instanceof Manager);
		System.out.println(emp instanceof ContractEmployee);
		if(emp instanceof Manager){
			Manager m = (Manager) emp;
			System.out.println(m.getDepartmentName());
			System.out.println(m.getEmployeeId());
			System.out.println(m.getName());
			System.out.println(m.getSalary());
		}
		if(emp instanceof ContractEmployee){
		ContractEmployee ce =(ContractEmployee) emp;
		System.out.println(ce.getSalary());
		System.out.println(ce.getName());
		System.out.println(ce.getDuration());
		System.out.println(ce.isExtendable());
		
		
		}
		
		
		em.close();
		factory.close();
	}

}
