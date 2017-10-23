package online.shixun.dao.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import online.shixun.dao.BaseDao;
import online.shixun.dao.UserDao;
import online.shixun.model.User;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
	@Autowired
	private BaseDao baseDao;
	private List<User> list;
	
	public List<User> getList() {
		return list;
	}

	public void setList(List<User> list) {
		this.list = list;
	}

	@SuppressWarnings("unchecked")
	public List<User> findUsers() {
		return (List<User>) baseDao.getHibernateTemplate().find("from User");
	}
	public void saveUser(User user){
		baseDao.getHibernateTemplate().save(user);
	}
	public void deleteUser(User user){
		baseDao.getHibernateTemplate().delete(user);
	}
	public void updateUser(User user){
		baseDao.getHibernateTemplate().update(user);
	}

	public void addUser(User user) {
		baseDao.getHibernateTemplate().save(user);
	}

	public User getUserById(Long id) {
		User user = baseDao.getHibernateTemplate().get(User.class, id);
		return user;
	}
}
