package com.luminar;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class EmployeeDao {
	
	private JdbcTemplate jdbc;

	public void setJdbc(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}

	public int saveEmployee(Employee e) {
		String query = "insert into employee values('" + e.getId() + "','" + e.getName() + "','" + e.getSalary() + "')";
		return jdbc.update(query);
	}

	public int updateEmployee(Employee e) {
		String query = "update employee set name='" + e.getName() + "',salary='" + e.getSalary() + "' where id='"
				+ e.getId() + "' ";
		return jdbc.update(query);
	}

	public int deleteEmployee(Employee e) {
		String query = "delete from employee where id='" + e.getId() + "' ";
		return jdbc.update(query);
	}
	
	
	 public List<Employee> getAllEmployees() {
	        String sql = "SELECT * FROM employee";

	        return jdbc.query(sql, new RowMapper<Employee>() {
	            @Override
	            public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
	                return new Employee(rs.getInt("id"), rs.getString("name"), rs.getFloat("salary"));
	            }
	        });
	    }
	

}
