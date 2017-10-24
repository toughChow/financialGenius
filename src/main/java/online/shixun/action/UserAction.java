package online.shixun.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import online.shixun.model.User;
import online.shixun.service.Impl.UserServiceImpl;

@Component("userAction")
public class UserAction extends ActionSupport implements ModelDriven<User>{
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private UserServiceImpl userServiceImpl;
	private List<User> list;
	private User user;
	
	public List<User> getList() {
		return list;
	}
	public void setList(List<User> list) {
		this.list = list;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	@Override
	public User getModel() {
		return user;
	}
	
	/**
	 * 找到所有user列表
	 * @return
	 */
	public String findUsers(){
		list=userServiceImpl.findUsers();
		return "list";
	}
	
	/**
	 * 添加单个用户
	 * 默认设置状态为 激活
	 * @return
	 */
	public String addUser(){
		userServiceImpl.addUser(user);
		return "jumpAgain";
	}
	
	/**
	 * 刪除用戶
	 * @return
	 */
	public String deleteUser(){
		userServiceImpl.deleteUser(user);
		return "jumpAgain";
	}
	
	/**
	 * 更新用戶
	 * @return
	 */
	public String updateUser(){
		userServiceImpl.updateUser(user);
		return "jumpAgain";
	}
	
	/**
	 * 通過id獲取User
	 * @return
	 */
	public String getUserById(){
		user = userServiceImpl.getUserById(user.getId());
		return "singleUser";
	}
	
	/**
	 * 找到所有user列表
	 * @return
	 */
	public String showUsersStatus(){
		list=userServiceImpl.findUsers();
		return "showStatus";
	}
}
