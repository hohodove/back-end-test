package com.test.controller;

import com.test.entity.Employee;
import com.test.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/employee")
public class EmployeeController {

  @Autowired
  private EmployeeService employeeService;

	@GetMapping("/{id}")
	public Employee getEmployee(@PathVariable Long id) {
		return employeeService.select(id);
	}

	@GetMapping()
	public List<Employee> getEmployees() {
		return employeeService.selectAll();
	}

	@PostMapping()
	public int postEmployee(@RequestBody Employee employee) {	
		return employeeService.insert(employee);
	}
	
	@PutMapping("/{id}")
	public int putEmployee(@PathVariable Long id, @RequestBody Employee employee) {
		return employeeService.update(employee);
	}

	@DeleteMapping("/{id}")
	public int deleteEmployee(@PathVariable Long id) {
		return employeeService.delete(id);
	}

}
