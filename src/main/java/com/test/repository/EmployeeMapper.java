package com.test.repository;

import java.util.List;

import com.test.entity.Employee;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface EmployeeMapper {

  @Select("SELECT * FROM employee")
  List<Employee> selectAll();

  @Select("SELECT * FROM employee WHERE id = #{id}")
  Employee select(Long id);

  @Insert("insert into employee (id, name, pass) values (#{id}, #{name}, #{pass})")
  int insert(Employee employee);

  @Update("update employee set name = #{name}, pass = #{pass} where id = #{id}")
  int update(Employee employee);

  @Delete("delete from employee where id = #{id}")
  int delete(Long id);

}
