package com.emirates_app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.emirates_app.entity.Employee;
import com.emirates_app.services.EmployeeService;

@Controller
public class EmployeeController {
@Autowired
	private EmployeeService empserv;
//https://localhost:8080/emp
	@RequestMapping("/emp")
	public String emp() {
		return "emp";
	}

	@RequestMapping("/saveemp")
	public String savepass(@ModelAttribute Employee employee) {// model attribute will help to read all the form data and convert as java object (now it was optional)
		empserv.saveEmployeeData(employee);

		return "emp";
	}
	//http://localhost:8080/listallemp
	@RequestMapping("/listallemp")
	public String listallEmp(Employee employee,Model model) {// model help to transfer data from controller to view	
		List<Employee> allEmpData = empserv.listallEmpData(employee);
		model.addAttribute("allEmpData",allEmpData);
		return "list_all_emp";
	}
	@RequestMapping("/deleteemp")
	public String deleteemp(@RequestParam("id") long id,Employee employee,Model model) {
		empserv.deleteOneEmp(id);
		List<Employee> allEmpData = empserv.listallEmpData(employee);
		model.addAttribute("allEmpData",allEmpData);
		return "list_all_emp";
	}
	@RequestMapping("/updateemp")
	public String updateOneEmp(@RequestParam("id") long id, Model model) {
		Employee employee = empserv.updateOneEmp(id);
		model.addAttribute("employee", employee);
		
		return "update_emp";
		
	}
	@RequestMapping("/updateOneEmp")
	public String updateOneEmp(Employee emp1, Model model) {
															 
		empserv.updateOneEmp(emp1);
		
		List<Employee> allEmpData = empserv.listallEmpData(emp1);
		model.addAttribute("allEmpData",allEmpData);
		return "list_all_emp";
	}
}
