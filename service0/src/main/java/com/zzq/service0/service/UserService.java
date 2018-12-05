package com.zzq.service0.service;


import com.zzq.service0.entities.User;

public interface UserService {

	User findUser(Integer id);

	int saveUser(User user);

	int deleteUser(Integer id);
}
