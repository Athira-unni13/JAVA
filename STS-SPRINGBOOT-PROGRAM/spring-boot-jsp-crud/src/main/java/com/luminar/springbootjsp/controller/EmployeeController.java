package com.luminar.springbootjsp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.luminar.springbootjsp.model.Employees;
import com.luminar.springbootjsp.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/")
	public String viewHomePage(Model model) {
		model.addAttribute("listEmployees", employeeService.getAllEmployee());
		return "index";
	}
	
	@GetMapping("/showNewEmployeeForm")
	public String showNewEmployeeForm(Model model) {
		Employees employees = new Employees();
		model.addAttribute("employee", employees);
		return "new_employee";
	}
	
	@PostMapping("/saveEmployee")
	public String saveEmployee(@ModelAttribute("employee") Employees employee) {
		employeeService.saveEmployee(employee);
		return "redirect:/" ;
	}
	
	@GetMapping("/showFormForUpdate/{id}")
	public String showFormUpdate(@PathVariable("id") Long id, Model model) {
		Employees employee = employeeService.getEmployeeById(id);
		model.addAttribute("employee", employee);
		return "update_employee";
	}
	
	@GetMapping("/deleteEmployee/{id}")
	public String deleteEmployee(@PathVariable("id") Long id) {
		this.employeeService.deleteEmployeeById(id);
		return "redirect/:";
	}

}
