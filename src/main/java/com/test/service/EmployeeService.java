package com.test.service;

import java.util.List;

import com.test.entity.Employee;
import com.test.repository.EmployeeMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
  
  @Autowired
  private EmployeeMapper employeeMapper;

  public Employee select(Long id) {
    return employeeMapper.select(id);
  }

  public List<Employee> selectAll() {
    return employeeMapper.selectAll();
  }

  public int insert(Employee employee) {
    return employeeMapper.insert(employee);
  }

  public int update(Employee employee) {
    return employeeMapper.update(employee);
  }

  public int delete(Long id) {
    return employeeMapper.delete(id);
  }

}
