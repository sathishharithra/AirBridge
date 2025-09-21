package com.emirates_app.services;

import java.util.List;

import com.emirates_app.entity.Employee;

public interface EmployeeService {
	public void saveEmployeeData(Employee employee);

	public List<Employee> listallEmpData(Employee employee);
	public void deleteOneEmp(long id);

	public Employee updateOneEmp(long id);

	public void updateOneEmp(Employee emp1);



}
