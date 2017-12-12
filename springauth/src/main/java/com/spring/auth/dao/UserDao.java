package com.spring.auth.dao;

import com.spring.auth.models.User;

public interface UserDao {

	User findByUserName(String username);

}