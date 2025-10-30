package com.luminar.springbootjsp.service;

import java.util.List;

import com.luminar.springbootjsp.model.Employees;

public interface EmployeeService {
	
	List<Employees> getAllEmployee();

	void saveEmployee(Employees employees);

	Employees getEmployeeById(Long id);

	void deleteEmployeeById(Long id);
}
