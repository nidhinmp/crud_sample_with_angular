package com.src.crud.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.src.crud.model.Employee;

@RestController
public class EmployeeController {
	
	private List<Employee> employees = createList();

	
	@RequestMapping("/employees")
	public List<Employee> getAllEmployees() {
		System.out.println("get all employees.!");
		return employees;
	}

	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello..!";
	}

	private List<Employee> createList() {
		// TODO Auto-generated method stub
		List<Employee> tempEmployees = new ArrayList<>();
		Employee emp1 = new Employee();
		emp1.setName("emp1");
		emp1.setDesignation("manager");
		emp1.setEmpId("1");
		emp1.setSalary(3000);

		Employee emp2 = new Employee();
		emp2.setName("emp2");
		emp2.setDesignation("developer");
		emp2.setEmpId("2");
		emp2.setSalary(3000);
		tempEmployees.add(emp1);
		tempEmployees.add(emp2);
		return tempEmployees;
	}


}
