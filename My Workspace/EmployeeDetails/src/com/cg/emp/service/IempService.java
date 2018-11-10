package com.cg.emp.service;

import com.capg.emp.exception.EmployeeException;
import com.cg.emp.bean.Employee;

public interface IempService {

	boolean validateData(Employee emp) throws EmployeeException;

	boolean store(Employee emp);

}
