package com.sujata.persistence;

import java.util.Collection;
import java.util.List;

import com.sujata.database.EmployeeDataBase;
import com.sujata.entity.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	
	
	@Override
	public Collection<Employee> getAllRecords() {
		return EmployeeDataBase.getEmployeeList().values();
	}

	@Override
	public Employee searchRecord(int id) {
		return EmployeeDataBase.getEmployeeList().get(id);
		
	}

	@Override
	public Employee insertRecord(Employee employee) {
		// TODO Auto-generated method stub
		return EmployeeDataBase.getEmployeeList().put(employee.getEmpId(), employee);
	}

}
