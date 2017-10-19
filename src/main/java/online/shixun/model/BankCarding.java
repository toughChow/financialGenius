package online.shixun.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_bankCarding")
public class BankCarding {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String bankName;
	private String bankAccount;
	private String password;
	private int count;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public BankCarding(Long id, String bankName, String bankAccount, String password, int count) {
		super();
		this.id = id;
		this.bankName = bankName;
		this.bankAccount = bankAccount;
		this.password = password;
		this.count = count;
	}

	@Override
	public String toString() {
		return "BankCarding [id=" + id + ", bankName=" + bankName + ", bankAccount=" + bankAccount + "]";
	}

	public BankCarding(Long id) {
		super();
		this.id = id;
	}

	public BankCarding(String bankName, String bankAccount, String password, int count) {
		super();
		this.bankName = bankName;
		this.bankAccount = bankAccount;
		this.password = password;
		this.count = count;
	}

	public BankCarding() {
		super();
	}

}
