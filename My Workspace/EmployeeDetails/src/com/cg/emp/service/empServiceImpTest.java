package com.cg.emp.service;

import static org.junit.Assert.assertFalse;


import org.junit.BeforeClass;
import org.junit.Test;

import com.capg.emp.exception.EmployeeException;
import com.cg.emp.bean.Employee;

public class empServiceImpTest {
	private static IempService iempService = null;

	@BeforeClass
	public static void createInstance() {
		iempService = new empServiceImp();
	}

	@Test(expected = EmployeeException.class)
	public void testEidForLength() throws EmployeeException {
		Employee empBean = new Employee();
		empBean.setEid(44);
		empBean.setEname("Prasanthi");
		empBean.setSal(15000.00);
		empBean.setDept("FS");
		boolean result = iempService.validateData(empBean);
		assertFalse(result);

	}

	@Test(expected = EmployeeException.class)
	public void testEidForNumbers() throws EmployeeException {
		Employee empBean = new Employee();
		empBean.setEid(11 % 80);
		empBean.setEname("Prasanthi");
		empBean.setSal(15000.00);
		empBean.setDept("FS");
		boolean result = iempService.validateData(empBean);
		assertFalse(result);
	}

	@Test(expected = EmployeeException.class)
	public void testEid() throws EmployeeException {
		Employee empBean = new Employee();
		empBean.setEid(11);
		empBean.setEname("Prasanthi");
		empBean.setSal(15000.00);
		empBean.setDept("FS");
		boolean result = iempService.validateData(empBean);
		assertFalse(result);
	}

	@Test(expected = EmployeeException.class)
	public void testEnamePositive() throws EmployeeException {
		Employee empBean = new Employee();
		empBean.setEid(1180);
		empBean.setEname("tom");
		empBean.setSal(15000.00);
		empBean.setDept("FS");
		boolean result = iempService.validateData(empBean);
		assertFalse(result);
	}

	@Test(expected = EmployeeException.class)
	public void testEnameForOnlyAlpha() throws EmployeeException {
		Employee empBean = new Employee();
		empBean.setEid(1180);
		empBean.setEname("1234");
		empBean.setSal(15000.00);
		empBean.setDept("FS");
		boolean result = iempService.validateData(empBean);
		assertFalse(result);
	}
}
