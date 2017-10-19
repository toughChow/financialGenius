package online.shixun.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String userName;
	private String password;
	private String sex;
	private String email;
	private int count;
	private String status;
	private String payPassword;
	@ManyToOne(cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)
	@JoinColumn(name = "role_id")
	private Role role;
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "t_user_invest", joinColumns = { @JoinColumn(name = "user_id") }, inverseJoinColumns = {
			@JoinColumn(name = "investment_id") })
	private Set<Investment> investments = new HashSet<Investment>();
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "user_id")
	private Set<WithdrawalRecord> withdrawalRecords = new HashSet<WithdrawalRecord>();
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "user_id")
	private Set<DepositRecord> depositRecords = new HashSet<DepositRecord>();
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "user_id")
	private Set<RechargeRecord> rechargeRecords = new HashSet<RechargeRecord>();
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "user_id")
	private Set<BankCarding> bankCardings = new HashSet<BankCarding>();

	public User(Long id) {
		super();
		this.id = id;
	}

	public User(String userName, String password, String sex, String email, int count, String status,
			String payPassword) {
		super();
		this.userName = userName;
		this.password = password;
		this.sex = sex;
		this.email = email;
		this.count = count;
		this.status = status;
		this.payPassword = payPassword;
	}

	public User(Long id, String userName, String password, String sex, String email, int count, String status,
			String payPassword) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.sex = sex;
		this.email = email;
		this.count = count;
		this.status = status;
		this.payPassword = payPassword;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPayPassword() {
		return payPassword;
	}

	public void setPayPassword(String payPassword) {
		this.payPassword = payPassword;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", sex=" + sex + ", email=" + email + ", count=" + count
				+ ", status=" + status + "]";
	}
}
