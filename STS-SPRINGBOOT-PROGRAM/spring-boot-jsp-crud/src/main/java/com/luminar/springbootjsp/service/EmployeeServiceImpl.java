package com.luminar.springbootjsp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luminar.springbootjsp.model.Employees;
import com.luminar.springbootjsp.repository.EmployeesRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeesRepository employeesRepository;
	
	@Override
	public List<Employees> getAllEmployee(){
		return employeesRepository.findAll();
	}
	
	@Override
	public void saveEmployee(Employees employees) {
		employeesRepository.save(employees);
	}
	
	@Override
	public Employees getEmployeeById(Long id) {
		Optional<Employees> optional = employeesRepository.findById(id);
		Employees employee = null;
		if(optional.isPresent()) {
			employee = optional.get();
		}else {
			throw new RuntimeException("Employee Not Found for Id: "+id);
		}
		return employee;
	}
	
	@Override
	public void deleteEmployeeById(Long id) {
		employeesRepository.deleteById(id);
	}
}
