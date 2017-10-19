package online.shixun.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import online.shixun.dao.Impl.UserDaoImpl;
import online.shixun.model.User;
import online.shixun.service.UserService;
@Service("userService")
public class UserServiceImpl implements UserService{
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

}
