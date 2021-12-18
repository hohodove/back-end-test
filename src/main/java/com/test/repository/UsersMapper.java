package com.test.repository;

import com.test.entity.Users;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UsersMapper {

  @Select("SELECT * FROM users WHERE username = #{username}")
  Users select(String username);

}
