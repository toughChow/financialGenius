package online.shixun.service;

import java.util.List;

import online.shixun.model.User;

public interface UserService {
	public List<User> findUsers();
	public void saveUser(User user);
	public void deleteUser(User user);
	public void updateUser(User user);

}
