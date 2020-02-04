package com.ramesha.training.salesmanager.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ramesha.training.salesmanager.model.Employee;

@Repository("you-can-use-anyname")
public class HibernateEmployeeRepositoryImpl implements EmployeeRepository {

	@Override
	public List<Employee> getAllEmployees() {
		
		List<Employee> emps = new ArrayList<Employee>();
		
		Employee employee = new Employee("Ramesha","Kottawa");
		emps.add(employee);
		
		return emps;
	}

}
