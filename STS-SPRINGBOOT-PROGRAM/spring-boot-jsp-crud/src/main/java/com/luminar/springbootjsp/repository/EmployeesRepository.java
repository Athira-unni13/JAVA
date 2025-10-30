package com.luminar.springbootjsp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.luminar.springbootjsp.model.Employees;

@Repository
public interface EmployeesRepository extends JpaRepository<Employees,Long> {

}
