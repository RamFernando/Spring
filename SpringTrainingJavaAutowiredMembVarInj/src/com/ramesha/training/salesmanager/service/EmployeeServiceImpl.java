package com.ramesha.training.salesmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ramesha.training.salesmanager.model.Employee;
import com.ramesha.training.salesmanager.repository.EmployeeRepository;
import com.ramesha.training.salesmanager.repository.HibernateEmployeeRepositoryImpl;

public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository){
		System.out.println("Overloaded Constructor");
		this.employeeRepository=employeeRepository;
	}
	
	public EmployeeServiceImpl(){
		System.out.println("Default Constructor");
	}

	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
		System.out.println("Setter executed");
	}

	@Override
	public List<Employee> getAllEmployees(){
		
		return employeeRepository.getAllEmployees();
	}
}
