package com.capgemini.doctor;

import javax.persistence.Embeddable;


@Embeddable
public class Qualification {
	String nameOfQualification;
	int experience;

	public String getNameOfQualification() {
		return nameOfQualification;
	}

	public void setNameOfQualification(String nameOfQualification) {
		this.nameOfQualification = nameOfQualification;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

}
