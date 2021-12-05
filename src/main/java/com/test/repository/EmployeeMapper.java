package com.test.repository;

import com.test.entity.Employee;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface EmployeeMapper {

  @Select("SELECT * FROM employee WHERE id = #{id}")
  Employee select(Long id);

}
