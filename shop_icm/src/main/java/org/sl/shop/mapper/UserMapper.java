package org.sl.shop.mapper;

import java.util.List;

import org.sl.shop.model.User;

public interface UserMapper {
	public int addUser(User user);

	public int updateUser(User user);

	public int deleteUser(User user);

	public List<User> getAllUser(User user);
	
	public User login(User user);
}
