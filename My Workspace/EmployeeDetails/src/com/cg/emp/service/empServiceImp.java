package com.cg.emp.service;

import com.capg.emp.exception.EmployeeException;
import com.capg.emp.exception.ExceptionMessages;
import com.cg.emp.bean.Employee;
import com.cg.emp.dao.IempDao;
import com.cg.emp.dao.empDaoImpl;

public class empServiceImp implements IempService {
	IempDao dao = new empDaoImpl();

	public boolean validateData(Employee emp) throws EmployeeException {
		// TODO Auto-generated method stub

		if (emp.getEname().length() > 3) {
			boolean isValid = false;
			if (!(emp.getEname().length() > 4)) {
				throw new EmployeeException(ExceptionMessages.ERROR1);
			}

			if (!(emp.getEid() > 999)) {
				throw new EmployeeException(ExceptionMessages.ERROR2);
			}

			if (!(emp.getSal() > 1000)) {
				throw new EmployeeException(ExceptionMessages.ERROR3);
			}

			if ((emp.getDept() == null)) {
				throw new EmployeeException(ExceptionMessages.ERROR4);
			}

			return isValid;

		} 
		else{
		return true;}
	}

	@Override
	public boolean store(Employee emp) {
		// TODO Auto-generated method stub
		return dao.store(emp);
	}

}
