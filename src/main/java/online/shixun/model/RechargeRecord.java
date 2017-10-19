package online.shixun.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tb_recharge")
public class RechargeRecord {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int rechargeCount;
	private String rechargeBank;
	@Temporal(TemporalType.DATE)
	private Date createDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getRechargeCount() {
		return rechargeCount;
	}

	public void setRechargeCount(int rechargeCount) {
		this.rechargeCount = rechargeCount;
	}

	public String getRechargeBank() {
		return rechargeBank;
	}

	public void setRechargeBank(String rechargeBank) {
		this.rechargeBank = rechargeBank;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public RechargeRecord() {
		super();
	}

	public RechargeRecord(Long id) {
		super();
		this.id = id;
	}

	public RechargeRecord(int rechargeCount, String rechargeBank, Date createDate) {
		super();
		this.rechargeCount = rechargeCount;
		this.rechargeBank = rechargeBank;
		this.createDate = createDate;
	}

	public RechargeRecord(Long id, int rechargeCount, String rechargeBank, Date createDate) {
		super();
		this.id = id;
		this.rechargeCount = rechargeCount;
		this.rechargeBank = rechargeBank;
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "RechargeRecord [id=" + id + ", rechargeCount=" + rechargeCount + ", rechargeBank=" + rechargeBank
				+ ", createDate=" + createDate + "]";
	}

}
