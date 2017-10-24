package online.shixun.action;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import online.shixun.model.Investment;
import online.shixun.service.Impl.InvestmentServiceImpl;

@Component("ajaxInvestmentAction")
public class AjaxInvestmentAction extends ActionSupport implements ModelDriven<Investment>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Investment investment=new Investment();
	private Map<String,Object> dataMap;
	@Autowired
	private InvestmentServiceImpl investmentServiceImpl;
	public String addCheckUsername(){
		boolean flag=investmentServiceImpl.findInvestment(investment);
		dataMap=new HashMap<String,Object>();
		if(flag){
			dataMap.put("success",flag);
		}else{
			dataMap.put("success", flag);
		}
		return SUCCESS;
	}
	public Investment getInvestment() {
		return investment;
	}
	public void setInvestment(Investment investment) {
		this.investment = investment;
	}
	public Map<String, Object> getDataMap() {
		return dataMap;
	}
	public void setDataMap(Map<String, Object> dataMap) {
		this.dataMap = dataMap;
	}
	@Override
	public Investment getModel() {
		return investment;
	}

}
