package com.test.controller;

import com.test.entity.Employee;
import com.test.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

  @Autowired
  private EmployeeService employeeService;

	@GetMapping("/{id}")
	public Employee select(@PathVariable Long id) {
		return employeeService.select(id);
	}

}
