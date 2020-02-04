package com.ramesha.training.salesmanager.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ramesha.training.salesmanager.repository.EmployeeRepository;
import com.ramesha.training.salesmanager.repository.HibernateEmployeeRepositoryImpl;
import com.ramesha.training.salesmanager.service.EmployeeService;
import com.ramesha.training.salesmanager.service.EmployeeServiceImpl;

@Configuration
public class ApplicationConfiguration {
	
	@Bean(name = "employeeService")
	public EmployeeService getEmployeeService() {
		
		EmployeeServiceImpl employeeService = new EmployeeServiceImpl(getEmployeeRepository());
		
		return employeeService;
	}
	
	@Bean(name = "employeeRepository")
	public EmployeeRepository getEmployeeRepository() {
		return new HibernateEmployeeRepositoryImpl();
	}

}
