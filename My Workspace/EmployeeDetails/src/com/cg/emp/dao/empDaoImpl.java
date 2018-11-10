package com.cg.emp.dao;

import java.util.ArrayList;
import java.util.Scanner;

import com.cg.emp.bean.Employee;

public class empDaoImpl implements IempDao {

	Scanner sc= new Scanner(System.in);
	ArrayList<Employee> empList= new ArrayList<Employee>();
	

	@Override
	public boolean store(Employee emp) {
		// TODO Auto-generated method stub
		empList.add(emp);
		System.out.println(empList);
		return empList.add(emp);
	}

}
