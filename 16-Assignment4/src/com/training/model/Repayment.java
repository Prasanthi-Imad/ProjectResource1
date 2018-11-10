package com.training.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="repay1")
public class Repayment {
	@Id
	int repaymentId;
	double repayAmount;
	int installmentNo;

	public int getRepaymentId() {
		return repaymentId;
	}

	public void setRepaymentId(int repaymentId) {
		this.repaymentId = repaymentId;
	}

	public double getRepayAmount() {
		return repayAmount;
	}

	public void setRepayAmount(double repayAmount) {
		this.repayAmount = repayAmount;
	}

	public int getInstallmentNo() {
		return installmentNo;
	}

	public void setInstallmentNo(int installmentNo) {
		this.installmentNo = installmentNo;
	}


	@Override
	public String toString() {
		return "Repayment [repaymentId=" + repaymentId + ", repayAmount="
				+ repayAmount + ", installmentNo=" + installmentNo + "]";
	}

	public Repayment(int repaymentId, double repayAmount, int installmentNo) {
		super();
		this.repaymentId = repaymentId;
		this.repayAmount = repayAmount;
		this.installmentNo = installmentNo;
	}

	public Repayment() {
		super();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + repaymentId;
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
		Repayment other = (Repayment) obj;
		if (repaymentId != other.repaymentId)
			return false;
		return true;
	}

}
