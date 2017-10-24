package online.shixun.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import online.shixun.dao.Impl.UserDaoImpl;
import online.shixun.model.User;
import online.shixun.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDaoImpl userDao;

	@Override
	public List<User> findUsers() {
		return userDao.findUsers();
	}

	@Override
	public void saveUser(User user) {
		userDao.saveUser(user);
	}

	@Override
	public void deleteUser(User user) {
		userDao.deleteUser(user);
	}

	@Override
	public void updateUser(User user) {
		userDao.updateUser(user);
	}

	public void addUser(User user) {
		user.setStatus("激活");
		userDao.addUser(user);
	}

	public User getUserById(Long id) {
		return userDao.getUserById(id);
	}

	public boolean getUserByName(String username) {
		List<User> user = userDao.getUserByName(username);
		/*
		 * 为空 改用户名可用 返回true 不为空 不可用 返回false
		 */
		if (user.size()<=0)
			return true;
		else
			return false;
	}

}
