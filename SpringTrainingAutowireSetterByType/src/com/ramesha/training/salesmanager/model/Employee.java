package com.ramesha.training.salesmanager.model;

public class Employee {
	
	private String empName;
	private String empLocation;
	
	public Employee(String empName, String empLocation) {
		super();
		this.empName = empName;
		this.empLocation = empLocation;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpLocation() {
		return empLocation;
	}

	public void setEmpLocation(String empLocation) {
		this.empLocation = empLocation;
	}
	
	
}
