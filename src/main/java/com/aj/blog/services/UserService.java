package com.aj.blog.services;

import java.util.List;

import com.aj.blog.payloads.UserDto;

public interface UserService {
	UserDto registerUser(UserDto userDto);
	UserDto createUser(UserDto userDto);
	UserDto updateUser(UserDto userDto, Integer userId);
	UserDto getUserById(Integer userId);
	List<UserDto> getAllUsers();
	void deleteUser(Integer userId);
}
