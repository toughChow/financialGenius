package online.shixun.service;

import java.util.List;

import online.shixun.model.Investment;

public interface InvestmentService {
	/**
	 * 添加投資項目
	 * @param investment
	 */
	public void addInvestment(Investment investment);
	
	/**
	 * 获取所有的投资项目
	 * @return
	 */
	public List<Investment> getAllInvestments();
	
	/**
	 * 删除投资项目
	 * @param investment
	 */
	public void deleteInvestment(Investment investment);
	
	/**
	 * 通过id获取投资项目
	 * @param id
	 * @return
	 */
	public Investment getInvestmentById(Long id);
	
	/**
	 * 更改investment
	 * @param investment
	 */
	public void updateInvestment(Investment investment);
}
