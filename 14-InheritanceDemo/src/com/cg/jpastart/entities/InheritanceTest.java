package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InheritanceTest {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		//create one employee
		Employee employee = new Employee();
		employee.setEmployeeId(1);
		employee.setName("John");
		employee.setSalary(5000);
		//em.persist(employee);
		
		//create one manager
		Manager manager = new Manager();
		manager.setEmployeeId(2);
		manager.setName("Trisha");
		manager.setSalary(8000);
		manager.setDepartmentName("Sales");
		//em.persist(manager);
		
		ContractEmployee contractEmployee = new ContractEmployee();
		contractEmployee.setName("Ravi");
		contractEmployee.setSalary(15000);
		contractEmployee.setDuration(2);
		contractEmployee.setExtendable(true);
		em.persist(contractEmployee);
		
		
		em.getTransaction().commit();
		
		System.out.println("Added one employee and manager to database.");
		em.close();
		factory.close();
	}
}
