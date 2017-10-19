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
@Table(name = "tb_deposit")
public class DepositRecord {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int depositCount;
	private String depositName;
	@Temporal(TemporalType.DATE)
	private Date createDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public int getDepositCount() {
		return depositCount;
	}

	public void setDepositCount(int depositCount) {
		this.depositCount = depositCount;
	}

	public String getDepositName() {
		return depositName;
	}

	@Override
	public String toString() {
		return "DepositRecord [id=" + id + ", depositCount=" + depositCount + ", depositName=" + depositName
				+ ", createDate=" + createDate + "]";
	}

	public void setDepositName(String depositName) {
		this.depositName = depositName;
	}

	public DepositRecord(Long id) {
		super();
		this.id = id;
	}

	public DepositRecord(int depositCount, String depositName, Date createDate) {
		super();
		this.depositCount = depositCount;
		this.depositName = depositName;
		this.createDate = createDate;
	}

	public DepositRecord() {
		super();
	}

	public DepositRecord(Long id, int depositCount, String depositName, Date createDate) {
		super();
		this.id = id;
		this.depositCount = depositCount;
		this.depositName = depositName;
		this.createDate = createDate;
	}

}
