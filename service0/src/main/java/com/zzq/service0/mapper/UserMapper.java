package com.zzq.service0.mapper;


import com.zzq.service0.entities.User;

public interface UserMapper {
	User findUser(Integer id);

	int saveUser(User user);

	int deleteUser(Integer id);
}
