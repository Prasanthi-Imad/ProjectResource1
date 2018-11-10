package com.cg.emp.ui;

import java.util.Scanner;

import com.capg.emp.exception.EmployeeException;
import com.cg.emp.bean.Employee;
import com.cg.emp.service.IempService;
import com.cg.emp.service.empServiceImp;

public class Client {

	public static void main(String[] args) throws EmployeeException {
		Scanner sc = new Scanner(System.in);
		IempService service = new empServiceImp();
		System.out.println("Insert Employee Details");
		System.out.println("Enter employee id");
		Integer eid = sc.nextInt();
		System.out.println("Enter employee name");
		String ename = sc.next();
		System.out.println("Enter salary:");
		Double sal = sc.nextDouble();
		System.out.println("Enter dept");
		String dept = sc.next();
		Employee emp = new Employee();
		emp.setEid(eid);
		emp.setEname(ename);
		emp.setSal(sal);
		emp.setDept(dept);
		boolean isValid = service.validateData(emp);
		if (isValid = true) {
			service.store(emp);
			System.out.println("Added successfully...");
		}
		sc.close();
	}

}
