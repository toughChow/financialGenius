package online.shixun.web.intercept;

import org.apache.struts2.ServletActionContext;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

@Component
public class AdminLoginInterceptor extends MethodFilterInterceptor{

	private static final long serialVersionUID = 1L;

	@Override
	protected String doIntercept(ActionInvocation invocation) throws Exception {
		String admin = (String) ServletActionContext.getRequest().getSession().getAttribute("username");
		if(admin == null){
			return "login";
		}
		return invocation.invoke();
	}

}
