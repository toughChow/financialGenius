package online.shixun.service;

import java.util.List;

import online.shixun.model.User;

public interface UserService {
	public List<User> findUsers();
	public void saveUser(User user);
	public void deleteUser(User user);
	public void updateUser(User user);
	/**
	 * 添加用戶
	 * @param user
	 */
	public void addUser(User user);
	
	/**
	 * 通過id獲取用戶
	 * @param id
	 * @return
	 */
	public User getUserById(Long id);
	
	/**
	 * 通过用户名查找该用户名是否存在
	 * @param username
	 * @return
	 */
	public boolean getUserByName(String username);

}
