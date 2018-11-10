package com.capgemini.database;

import java.sql.SQLException;
import java.util.List;

import com.capgemini.business.Customer;

public interface CustomerDAO {
	
	boolean addCustomer(Customer customer) throws ClassNotFoundException, SQLException;
	boolean removeCustomer(int customerId) throws ClassNotFoundException, SQLException;
	boolean updateCustomer(Customer customer) throws ClassNotFoundException, SQLException;
	Customer findCustomer(int CustomerId);
	List<Customer> getAllCustomers() throws ClassNotFoundException, SQLException;
	
}
