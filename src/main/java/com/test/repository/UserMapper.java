package com.test.repository;

import com.test.entity.User;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper {

  @Select("SELECT * FROM users WHERE username = #{username}")
  User select(String username);

}
