package com.capgemini.db;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgemini.business.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

	@Override
	public boolean addEmployee(Employee employee) {
		try{
			EntityManagerFactory emf = Persistence
					.createEntityManagerFactory("JPA-PU");
			EntityManager em = emf.createEntityManager();
			em.getTransaction().begin();
			em.persist(employee);
			em.getTransaction().commit();
			em.close();
			emf.close();
			return true;
		}
		catch(Exception e){
			return false;
		}
		
	}

	@Override
	public boolean removeEmployee(int id) {
		try{
			EntityManagerFactory emf = Persistence
					.createEntityManagerFactory("JPA-PU");
			EntityManager em = emf.createEntityManager();
			em.getTransaction().begin();
			Employee e = em.find(Employee.class, id);
			em.remove(e);
			em.getTransaction().commit();
			em.close();
			emf.close();
			return true;
		}
		catch(Exception e){
			return false;
		}
		
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		Employee emp = null;
		try{
			EntityManagerFactory emf = Persistence
					.createEntityManagerFactory("JPA-PU");
			EntityManager em = emf.createEntityManager();
			em.getTransaction().begin();
			
			emp = em.find(Employee.class, employee);
			em.merge(emp);
			em.getTransaction().commit();
			em.close();
			emf.close();
			return true;
		}
		catch(Exception ex){
			return false;
		}
		
	}

	@Override
	public Employee findEmployee(int id) {
		Employee e = null;
		try{
			EntityManagerFactory emf = Persistence
					.createEntityManagerFactory("JPA-PU");
			EntityManager em = emf.createEntityManager();
			e=em.find(Employee.class, id);
			
			return e;
		
		}
		catch(Exception ex){
			return e;
		}
		
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> empList = null;
		try{
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("JPA-PU");
		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery("from Employee");
		empList = query.getResultList();
		em.close();
		emf.close();
		return empList;
		}
		catch(Exception e){
		return empList;
		}
	}

}
