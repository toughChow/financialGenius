package online.shixun.dao.Impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.stereotype.Repository;

import online.shixun.dao.BaseDao;
import online.shixun.dao.UserDao;
import online.shixun.model.User;

@Repository("userDao")
public class UserDaoImpl<T> implements UserDao {
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

	public void saveUser(User user) {
		baseDao.getHibernateTemplate().save(user);
	}

	public void deleteUser(User user) {
		baseDao.getHibernateTemplate().delete(user);
	}

	public void updateUser(User user) {
		baseDao.getHibernateTemplate().update(user);
	}

	public void addUser(User user) {
		baseDao.getHibernateTemplate().save(user);
	}

	public User getUserById(Long id) {
		User user = baseDao.getHibernateTemplate().get(User.class, id);
		return user;
	}

	public List<User> getUserByName(String username) {
		String hql = "From User u where u.userName=:myUsername";
		String paramName = "myUsername";
		@SuppressWarnings("unchecked")
		List<User> list = (List<User>) baseDao.getHibernateTemplate().findByNamedParam(hql, paramName, username);
		return list;
	}

	public int getCount() {
		String hql = "select count(*) from User";
		@SuppressWarnings("unchecked")
		List<Long> count = (List<Long>) baseDao.getHibernateTemplate().find(hql);
		int count1 = count.size() > 0 ? (count.get(0).intValue()) : 0;
		return count1;
	}

	@SuppressWarnings("unchecked")
	public List<User> queryForPage(String string, int offset, int length) {
		return (List<User>) baseDao.getHibernateTemplate().execute(new HibernateCallback<Object>() {
			public Object doInHibernate(Session session) throws HibernateException{
				Criteria criteria = session.createCriteria(User.class);
                criteria.setFirstResult(offset);
                criteria.setMaxResults(length);
				return criteria.list();
			}
		});
	}
}
