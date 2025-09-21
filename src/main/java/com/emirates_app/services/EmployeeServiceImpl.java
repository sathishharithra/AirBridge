package com.emirates_app.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emirates_app.entity.Employee;
import com.emirates_app.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository emprepo;

	@Override
	public void saveEmployeeData(Employee employee) {
		emprepo.save(employee);
	}

	@Override
	public List<Employee> listallEmpData(Employee employee) {
		List<Employee> allEmpData = emprepo.findAll();
		return allEmpData;
	}

	@Override
	public void deleteOneEmp(long id) {
		emprepo.deleteById(id);

	}

	@Override
	public Employee updateOneEmp(long id) {
		Optional<Employee> oneEmp = emprepo.findById(id); // optional class is a java 8 feature it will handle null pointer exception
														
		Employee employee = oneEmp.get();// get method will convert optional object to normal object

		return employee;
	}

	@Override
	public void updateOneEmp(Employee emp1) {
		emprepo.save(emp1);
	}

}
