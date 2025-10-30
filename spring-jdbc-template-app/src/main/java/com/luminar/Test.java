package com.luminar;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	private static ApplicationContext ctx;

	public static void main(String[] args) {
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

		EmployeeDao dao = (EmployeeDao) ctx.getBean("edao");

		 int status=dao.saveEmployee(new Employee(23,"Bini",5000));
		 System.out.println(status);

		List<Employee> employees = dao.getAllEmployees();
		for (Employee s : employees) {
			System.out.println("ID: " + s.getId() + ", Name: " + s.getName() + ", Salary: " + s.getSalary());
		}

		/*
		 * int status=dao.updateEmployee(new Employee(23,"Bini",3000));
		 * System.out.println(status);
		 */

		/*
		 * int status=dao.deleteEmployee(new Employee(23)); System.out.println(status);
		 */

	}

}