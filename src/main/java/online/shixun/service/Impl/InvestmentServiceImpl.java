package online.shixun.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import online.shixun.dao.Impl.InvestmentDaoImpl;
import online.shixun.model.Investment;
import online.shixun.service.InvestmentService;

@Service("investmentService")
public class InvestmentServiceImpl implements InvestmentService{

	@Autowired
	private InvestmentDaoImpl investmentDao;

	public void addInvestment(Investment investment) {
		investmentDao.addInvestment(investment);
	}

	@Override
	public List<Investment> getAllInvestments() {
		return investmentDao.getAllInvestments();
	}

	public void deleteInvestment(Investment investment) {
		investmentDao.deleteInvestment(investment);
	}

	@Override
	public Investment getInvestmentById(Long id) {
		return investmentDao.getInvestmentById(id);
	}

	public void updateInvestment(Investment investment) {
		investmentDao.updateInvestment(investment);
	}
	
}
