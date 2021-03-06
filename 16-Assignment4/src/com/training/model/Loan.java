package com.training.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="loan1")
public class Loan {
	@Id
	int loanId;
	String customerName;
	double loanAmount;
	
	@OneToMany(cascade=CascadeType.ALL)
	List<Repayment> list = new ArrayList<Repayment>();
	public int getLoanId() {
		return loanId;
	}
	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public List<Repayment> getList() {
		return list;
	}
	public void setList(List<Repayment> list) {
		this.list = list;
	}
	public void addRepayment(Repayment rp){
		this.list.add(rp);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + loanId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Loan other = (Loan) obj;
		if (loanId != other.loanId)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Loan [loanId=" + loanId + ", customerName=" + customerName
				+ ", loanAmount=" + loanAmount + ", list=" + list + "]";
	}
	
}
