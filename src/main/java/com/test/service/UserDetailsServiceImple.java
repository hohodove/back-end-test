package com.test.service;

import com.test.entity.User;
import com.test.repository.UserMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImple implements UserDetailsService {
  
  @Autowired
  private UserMapper mapper;

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    try {
      User user = mapper.select(username);
      String password = user.getPassword();
      return new UserDetailsImple(username, password);
    } catch (Exception e) {
      throw new UsernameNotFoundException("user not found.", e);
    }
  }
}
