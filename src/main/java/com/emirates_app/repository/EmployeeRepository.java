package com.emirates_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emirates_app.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
