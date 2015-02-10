package org.sl.shop.mapper;

import java.util.List;

import org.sl.shop.model.User;

public interface UserMapper {
	public void addUser(User user);

	public void updateUser(User user);

	public boolean deleteUser(User user);

	public List<User> getAllUser(User user);
	
	public User login(User user);
}
