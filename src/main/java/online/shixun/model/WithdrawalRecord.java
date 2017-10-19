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
@Table(name = "tb_withdraw")
public class WithdrawalRecord {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int withdrawCount;
	private String withdrawBank;
	@Temporal(TemporalType.DATE)
	private Date createDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getWithdrawCount() {
		return withdrawCount;
	}

	public void setWithdrawCount(int withdrawCount) {
		this.withdrawCount = withdrawCount;
	}

	public String getWithdrawBank() {
		return withdrawBank;
	}

	public void setWithdrawBank(String withdrawBank) {
		this.withdrawBank = withdrawBank;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public WithdrawalRecord(Long id, int withdrawCount, String withdrawBank, Date createDate) {
		super();
		this.id = id;
		this.withdrawCount = withdrawCount;
		this.withdrawBank = withdrawBank;
		this.createDate = createDate;
	}

	public WithdrawalRecord() {
		super();
	}

	public WithdrawalRecord(int withdrawCount, String withdrawBank, Date createDate) {
		super();
		this.withdrawCount = withdrawCount;
		this.withdrawBank = withdrawBank;
		this.createDate = createDate;
	}

	public WithdrawalRecord(Long id) {
		super();
		this.id = id;
	}

	@Override
	public String toString() {
		return "WithdrawalRecord [id=" + id + ", withdrawCount=" + withdrawCount + ", withdrawBank=" + withdrawBank
				+ ", createDate=" + createDate + "]";
	}

}
