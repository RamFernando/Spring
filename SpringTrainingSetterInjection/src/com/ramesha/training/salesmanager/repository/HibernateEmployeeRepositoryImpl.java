package com.ramesha.training.salesmanager.repository;

import java.util.ArrayList;
import java.util.List;

import com.ramesha.training.salesmanager.model.Employee;

public class HibernateEmployeeRepositoryImpl implements EmployeeRepository {

	@Override
	public List<Employee> getAllEmployees() {
		
		List<Employee> emps = new ArrayList<Employee>();
		
		Employee employee = new Employee("Ramesha","Kottawa");
		emps.add(employee);
		
		return emps;
	}

}
