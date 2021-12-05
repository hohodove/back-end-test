package com.test.service;

import com.test.entity.Employee;
import com.test.repository.EmployeeMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
  
  @Autowired
  private EmployeeMapper employeeMapper;

  public Employee select(Long id){
    return employeeMapper.select(id);
  }

}
