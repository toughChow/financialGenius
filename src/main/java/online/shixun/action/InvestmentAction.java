package online.shixun.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import online.shixun.model.Investment;
import online.shixun.service.Impl.InvestmentServiceImpl;

@Component
public class InvestmentAction extends ActionSupport implements ModelDriven<Investment> {

	private static final long serialVersionUID = 1L;
	
	@Autowired
	private InvestmentServiceImpl investmentService;

	private Investment investment;
	
	private List<Investment> list;

	public Investment getInvestment() {
		return investment;
	}

	public void setInvestment(Investment investment) {
		this.investment = investment;
	}

	public List<Investment> getList() {
		return list;
	}

	public void setList(List<Investment> list) {
		this.list = list;
	}

	@Override
	public Investment getModel() {
		return investment;
	}

	/**
	 * 添加投資項目
	 * @return
	 */
	public String addInvestment(){
		investmentService.addInvestment(investment);
		return "getLists";
	}
	
	/**
	 * 查找所有的投資項目
	 * @return
	 */
	public String findInvestments(){
		list = investmentService.getAllInvestments();
		return SUCCESS;
	}
	
	/**
	 * 删除投资项目
	 * @return
	 */
	public String deleteInvestment(){
		investmentService.deleteInvestment(investment);
		return "getLists";
	}
	
	/**
	 * 更新投资项目获取要更改的investment信息
	 * @return
	 */
	public String updateInvestment(){
		investment = investmentService.getInvestmentById(investment.getId());
		return "jumpToUpdate";
	}
	
	/**
	 * 更新投资
	 * @return
	 */
	public String updateInvestmentFinal(){
		investmentService.updateInvestment(investment);
		return "getLists";
	}

}
