package online.shixun.dao.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import online.shixun.dao.BaseDao;
import online.shixun.dao.InvestmentDao;
import online.shixun.model.Investment;

@Repository("investmentDao")
public class InvestmentDaoImpl implements InvestmentDao{

	@Autowired
	private BaseDao baseDao;
	
	public void addInvestment(Investment investment) {
		baseDao.getHibernateTemplate().save(investment);
	}

	@Override
	public List<Investment> getAllInvestments() {
		@SuppressWarnings("unchecked")
		List<Investment> list = (List<Investment>) baseDao.getHibernateTemplate().find("From Investment");
		return list;
	}

	@Override
	public void deleteInvestment(Investment investment) {
		baseDao.getHibernateTemplate().delete(investment);
	}

	@Override
	public Investment getInvestmentById(Long id) {
		return baseDao.getHibernateTemplate().get(Investment.class, id);
	}

	public void updateInvestment(Investment investment) {
		baseDao.getHibernateTemplate().update(investment);
	}

}
