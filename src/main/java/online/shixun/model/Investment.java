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
import javax.persistence.Table;

@Entity
@Table(name = "tb_investment")
public class Investment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String investName;
	private int investCount;
	private String description;
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "t_user_invest", joinColumns = { @JoinColumn(name = "investment_id") }, inverseJoinColumns = {
			@JoinColumn(name = "user_id") })
	private Set<User> users = new HashSet<User>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getInvestName() {
		return investName;
	}

	public void setInvestName(String investName) {
		this.investName = investName;
	}

	public int getInvestCount() {
		return investCount;
	}

	public void setInvestCount(int investCount) {
		this.investCount = investCount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Investment(Long id, String investName, int investCount, String description, Set<User> users) {
		super();
		this.id = id;
		this.investName = investName;
		this.investCount = investCount;
		this.description = description;
		this.users = users;
	}

	public Investment(String investName, int investCount, String description, Set<User> users) {
		super();
		this.investName = investName;
		this.investCount = investCount;
		this.description = description;
		this.users = users;
	}

	public Investment(Long id) {
		super();
		this.id = id;
	}

	public Investment() {
		super();
	}

	@Override
	public String toString() {
		return "Investment [id=" + id + ", investName=" + investName + ", investCount=" + investCount + ", description="
				+ description + "]";
	}

}
