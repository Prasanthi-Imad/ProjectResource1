package com.capgemini.bank;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name="customer1")
public class Customer {
	@Id
	int c_id;
	String name;
	
	@Temporal(TemporalType.DATE)	//required for Date and Calendar Types
	@Column(name = "date_of_birth")
	Date dob;
	@ManyToMany(fetch=FetchType.LAZY,mappedBy="customerList")
	List<Bank> bankList = new ArrayList<>();
	public int getId() {
		return c_id;
	}
	public void setId(int id) {
		this.c_id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public List<Bank> getBankList() {
		return bankList;
	}
	public void setBankList(List<Bank> bankList) {
		this.bankList = bankList;
	}
	public void addBank(Bank bank){
		this.bankList.add(bank);
		}
	@Override
	public String toString() {
		return "Customer [id=" + c_id + ", name=" + name + ", dob=" + dob
				+ ", bankList=" + bankList + "]";
	}
	
	
}
