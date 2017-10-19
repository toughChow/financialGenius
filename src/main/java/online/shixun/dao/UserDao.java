package online.shixun.dao;

import java.util.List;

import online.shixun.model.User;

public interface UserDao {
	public List<User> findUsers();
	public void saveUser(User user);
	public void deleteUser(User user);
	public void updateUser(User user);

}
