package com.capgemini.ui;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.capgemini.business.Customer;
import com.capgemini.database.CustomerDAO;
import com.capgemini.database.CustomerDAOImpl;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("***Customer Application***");
		System.out.println("-----------------------");
		System.out.println("1.Add new customer");
		System.out.println("2.Update existing customer details");
		System.out.println("3.Display all customer details");
		System.out.println("4.Delete existing customer details");
		System.out.println("5.Exit");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter choice : ");
		int choice = scanner.nextInt();
		switch (choice) {
			case 1:
				add();
				break;
			case 2:
				update();
				break;
			case 3:
				display();
				break;
			case 4:
				remove();
				break;
			case 5:
				System.out.println("Thank you");
				break;
		}
		scanner.close();
	}

	public static void remove() throws ClassNotFoundException, SQLException {
		int inp_id = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter id to remove");
		inp_id = scanner.nextInt();
		CustomerDAO dao = new CustomerDAOImpl();
		boolean result = dao.removeCustomer(inp_id);
		if(result){
			System.out.println("Successfully deleted");
		}
		else{
			System.out.println("Not deleted");
		}
		
		scanner.close();
	}

	public static void display() throws ClassNotFoundException, SQLException {
		CustomerDAO dao = new CustomerDAOImpl();
		List<Customer> customerList = dao.getAllCustomers();
		//System.out.println(customerList);
		for(Customer customers : customerList){
			System.out.print(customers.getId()+"\t");
			System.out.print(customers.getName()+"\t");
			System.out.print(customers.getCity()+"\t");
			System.out.println(customers.getOutStandingAmount());
		}
	}

	public static void update() throws ClassNotFoundException, SQLException {
		int id;
		/*String name =null;*/
		String city =null;
		/*double amt = 0.0;*/
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter id : ");
		id = scanner.nextInt();
		/*System.out.print("Enter name : ");
		name = scanner.next();*/
		System.out.print("Enter city : ");
		city = scanner.next();
		/*System.out.print("Enter outstanding amount : ");
		amt = scanner.nextDouble();*/
		Customer customer = new Customer();
		customer.setId(id);
		/*customer.setName(name);*/
		customer.setCity(city);
		/*customer.setOutStandingAmount(amt);*/
		CustomerDAO dao = new CustomerDAOImpl();
		boolean result = dao.updateCustomer(customer);
		if(result){
			System.out.println("Updated succsesfully");
		}
		else{
			System.out.println("Not added");
		}
		scanner.close();
		
	}

	public static void add() throws ClassNotFoundException, SQLException  {
		int id;
		String name =null;
		String city =null;
		double amt = 0.0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter id : ");
		id = scanner.nextInt();
		System.out.print("Enter name : ");
		name = scanner.next();
		System.out.print("Enter city : ");
		city = scanner.next();
		System.out.print("Enter outstanding amount : ");
		amt = scanner.nextDouble();
		Customer customer = new Customer();
		customer.setId(id);
		customer.setName(name);
		customer.setCity(city);
		customer.setOutStandingAmount(amt);
		CustomerDAO dao = new CustomerDAOImpl();
		boolean result = dao.addCustomer(customer);
		if(result){
			System.out.println("Added succsesfully");
		}
		else{
			System.out.println("Not added");
		}
		scanner.close();
	}

}
