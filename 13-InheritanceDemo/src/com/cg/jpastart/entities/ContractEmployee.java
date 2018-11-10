package com.cg.jpastart.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("CE")
@Table(name = "con_emp2")
public class ContractEmployee extends Employee {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int duration;
	boolean extendable;
	
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public boolean isExtendable() {
		return extendable;
	}
	public void setExtendable(boolean extendable) {
		this.extendable = extendable;
	}
	@Override
	public String toString() {
		return "ContractEmployee [duration=" + duration + ", extendable="
				+ extendable + ", getEmployeeId()=" + getEmployeeId()
				+ ", getName()=" + getName() + ", getSalary()=" + getSalary()
				+ "]";
	}
	

}
