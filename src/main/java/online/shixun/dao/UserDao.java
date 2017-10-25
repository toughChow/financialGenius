package online.shixun.dao;

import java.util.List;

import online.shixun.model.User;

public interface UserDao {
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
	 * 通過id獲取user
	 * @param id
	 * @return
	 */
	public User getUserById(Long id);
	
	/**
	 * 通过用户名查找该用户是否存在
	 * @param username
	 * @return User对象
	 */
	public List<User> getUserByName(String username);
	
	public int getCount();
	
	public List<User> queryForPage(String string, int offset, int length);

}
