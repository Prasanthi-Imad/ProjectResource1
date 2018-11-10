package com.capgemini.bank;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "bank1")
public class Bank {
	@Id
	int b_id;
	String name;
	String headOfficeLocation;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "bank_customer", joinColumns = { @JoinColumn(name = "b_id") }, inverseJoinColumns = { @JoinColumn(name = "c_id") })
	List<Customer> customerList = new ArrayList<>();

	public int getId() {
		return b_id;
	}

	public void setId(int id) {
		this.b_id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHeadOfficeLocation() {
		return headOfficeLocation;
	}

	public void setHeadOfficeLocation(String headOfficeLocation) {
		this.headOfficeLocation = headOfficeLocation;
	}

	public List<Customer> getCustomerList() {
		return customerList;
	}

	public void setCustomerList(List<Customer> customerList) {
		this.customerList = customerList;
	}

	public void addCustomer(Customer customer) {
		this.customerList.add(customer);
	}

	@Override
	public String toString() {
		return "Bank [id=" + b_id + ", name=" + name + ", headOfficeLocation="
				+ headOfficeLocation + ", customerList=" + customerList + "]";
	}

}
